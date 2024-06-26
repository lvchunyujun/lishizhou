package com.hexiaofei.provider0.service.impl.spider;

import com.hexiaofei.provider0.common.SpringContextUtil;
import com.hexiaofei.provider0.common.consts.SjzSystemConsts;
import com.hexiaofei.provider0.domain.SjzSpiderWebsite;
import com.hexiaofei.provider0.task.HtmlTag;
import com.shijianzhou.language.engine.content.SjzNlContentConsumeFactory;
import com.shijianzhou.language.engine.content.SjzNlMapStringContentConsumeFactory;
import com.shijianzhou.process.IResourceResolve;
import com.shijianzhou.process.entity.HtmlJsoupResource;
import com.shijianzhou.process.entity.IResource;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;
import us.codecraft.webmagic.selector.Selectable;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


@Component
@DependsOn("springContextUtil")
public class ArtificialPageProcessor implements PageProcessor {

    private final static Logger LOGGER = LoggerFactory.getLogger(ArtificialPageProcessor.class);
    // 设置请求头模仿浏览器，避免发生 403问题

    /**
     * 缓存已经执行了的URL，避免重复
     */
    private static ConcurrentHashMap<String,Set<String>> concurrentHashMap;

    private Long startCrawlTime;

    /**
     * 递归标识：true-抓取页面中的连接，false-不抓取页面中的连接
     */
    private boolean recursionFlag;

    @Autowired
    @Qualifier("htmlTagResourceResolve")
    private IResourceResolve htmlTagResourceResolve;

    public ArtificialPageProcessor() {
        this(System.currentTimeMillis(),true);
        htmlTagResourceResolve = SpringContextUtil.getBean("htmlTagResourceResolve");
    }

    public ArtificialPageProcessor(Long startCrawlTime,boolean recursionFlag){
        this.startCrawlTime = startCrawlTime;
        this.recursionFlag = recursionFlag;
        htmlTagResourceResolve = SpringContextUtil.getBean("htmlTagResourceResolve");
    }

    /**
     * 爬虫接口回调解析内容方法
     * @param page
     */
    @Override
    public void process(Page page) {
        LOGGER.info("【解析网站页面】--> {}",page.getUrl());
        Map<String, List<String>> header = page.getHeaders();
        List<String> list = new ArrayList<String>();
        list.add(String.valueOf(page.getStatusCode()));
//        header.put("statusCode",list);

        cssSelecterParseBody(page);

        // 200：success
        if(page.getStatusCode() == 200){
            Html html = page.getHtml();
            Document document = html.getDocument();

            // parseHead
//            parseHead(page,document.head(),header);

            // parseBody
            parseBody(page,document.body());


        }else{
            LOGGER.info("【解析网站页面】网站异常{}  statusCode:{}",page.getUrl(),page.getStatusCode());
        }
        LOGGER.info("【解析网站页面】--> {}",page.getUrl());
    }

    /**
     * parse HTML HEAD part
     * @param page
     * @param head
     * @param header
     */
    public void parseHead(Page page,Element head,Map<String, List<String>> header){
        String url = page.getUrl().toString();
        LOGGER.info("【解析网站页面HEAD】--> [url:{}]",url);
        String title = "";
        String descri = "";

        Elements titleEmt = head.getElementsByTag("title");
        title = titleEmt.text();
        LOGGER.info("【解析网站页面HEAD】[url:{}], title:{}",url,(title!=null?title:""));
        Elements metas = head.getElementsByTag("meta");
        int metaSize = metas.size();

        for(int i = 0 ; i < metaSize ; i++){
            Element meta = metas.get(i);
            String attrName = meta.attr("name");
            if("description".equals(attrName)){
                descri = meta.attr("content");
                LOGGER.info("【解析网站页面HEAD】[url:{}], description:{}",url,meta.attr("content"));
            }
        }

        SjzSpiderWebsite ssw = new SjzSpiderWebsite();
        ssw.setWebsiteUrl(url);
        ssw.setWebsiteTitle(title);
        ssw.setWebsiteContent(descri);
        ssw.setCreateTime(new Date());
        ssw.setWebsiteDescri(descri);

        LOGGER.info("【解析网站页面HEAD】<-- [url:{}]",url);
    }

    public void cssSelecterParseBody(Page page){
        Selectable selectable = page.getHtml().css("div .g");
        List<String> list = selectable.all();

    }

    /**
     * 解析 HTML BODY part
     */
    public void parseBody(Page page,Element bodyEls){
        String url = page.getUrl().toString();
        LOGGER.info("【解析body】--> {}",url);
        Elements cse = bodyEls.children();
        Iterator<Element> itsEl = cse.iterator();

        // step1: 解析标签内容
        while (itsEl.hasNext()){
            parseElement(page, itsEl.next(),recursionFlag);
        }

        LOGGER.info("【解析body】<-- {}",url);
    }

    /**
     *
     * @param page
     * @param e
     * @param recursionFlag
     */
    private void parseElement(Page page, Element e,boolean recursionFlag){
        if(e==null){
            return;
        }
        String url = page.getUrl().toString();
        String tagName = e.tagName();
        String text = e.text();

        doConsumeContent(page,e);
        if(HtmlTag.A_TAG.equals(tagName)){

            if(LOGGER.isDebugEnabled()){
                LOGGER.debug(tagName+":"+text);
            }
            String href = e.attr("href");
            // 校验href连接是否合法

            // 是否递归调用超链接
            if(recursionFlag){
                page.addTargetRequest(new Request(href));
            }
        }else if(HtmlTag.TITLE_TAG.equals(tagName)){

        }else if(HtmlTag.IMG_TAG.equals(tagName)){

        }else if(HtmlTag.AREA_TAG.equals(tagName)){

        }else if(HtmlTag.DIV_TAG.equals(tagName)){
            // 校验连接是否合法
            if(LOGGER.isDebugEnabled()){
                LOGGER.debug(tagName+":"+text);
            }


        }else{

        }
        // 如果存在子节点
        Elements childrenElements;
        if((childrenElements = e.children()) != null){
            Iterator<Element> childrenElementIter = childrenElements.iterator();
            Element childrenElement;
            while (childrenElementIter.hasNext()){
                if((childrenElement = childrenElementIter.next())!=null){
                    parseElement(page,childrenElement,recursionFlag);
                }
            }
        }
    }

    /**
     * 消费Element内容
     * @param element
     */
    private void doConsumeContent(Page page,Element element){

        HtmlJsoupResource htmlJsoupResource = new HtmlJsoupResource();
        htmlJsoupResource.setUri(page.getUrl().toString());
        htmlJsoupResource.setElement(element);

        htmlTagResourceResolve.resolve(htmlJsoupResource);
    }



    /**
     * 网站设置
     * @return
     */
    @Override
    public Site getSite() {

        Site site = Site.me()
                .setUserAgent("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:56.0) Gecko/20100101 Firefox/56.0")
                .setRetryTimes(1)
                .setSleepTime(5000);
        return site;
    }


}
