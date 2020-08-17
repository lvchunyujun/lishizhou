package com.hexiaofei.provider0.web.admin.spider;

import com.hexiaofei.provider0.domain.SjzEventIndexTemp;
import com.hexiaofei.provider0.exception.IllegalPlatformAugumentException;
import com.hexiaofei.provider0.service.spider.ISpiderService;
import com.hexiaofei.provider0.vo.PageVo;
import com.hexiaofei.provider0.vo.SpiderUrlVo;
import com.hexiaofei.provider0.web.BaseController;
import com.hexiaofei.provider0.web.admin.AdminBaseController;
import com.lcyj.common.bo.spider.UriBO;
import com.lcyj.common.utils.cache.LcyjCache;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 人工操作抓取网站
 * artificial spider
 */
@Controller
public class ArtificialSpiderWebsiteController extends AdminBaseController implements BaseController<HashMap> {

    public static Logger LOGGER = LoggerFactory.getLogger(ArtificialSpiderWebsiteController.class);

    private final static String STATIC_BASE_URL = "/spider/artificial";

    @Autowired
    ISpiderService spiderService;

    @RequestMapping(STATIC_BASE_URL+"/index")
    @Override
    public String index() {
        return STATIC_BASE_URL+"/index";
    }

    @Override
    public String toAdd() {
        return null;
    }

    @Override
    public String add(HashMap sjzSpiderWebsite) {
        return null;
    }

    @Override
    public ModelAndView toUpdate(Integer id) {
        return null;
    }

    @Override
    public ModelAndView update(HashMap sjzSpiderWebsite) {
        return null;
    }

    @ResponseBody
    public String list(HashMap sjzSpiderWebsite, @PathVariable int currentPage,@PathVariable  int pageSize) {
        ResultEntity re = getResultEntity();


        return re.toString();
    }

    @Override
    public String delete(@PathVariable Integer id) {
        ResultEntity re = getResultEntity();

        return re.toString();
    }

    @RequestMapping(STATIC_BASE_URL+"/req")
    @ResponseBody
    public ResultEntity request(@RequestBody SpiderUrlVo spiderUrlVo, HttpServletRequest request){
        LOGGER.info("【手动搜索】-->");
        ResultEntity re = getResultEntity();

        boolean recursionBoolean = false;

        try{
            LcyjCache lcyjCache = LcyjCache.getInstance();
            lcyjCache.set("EVENT_LIST_TEMP",null);

            switch (spiderUrlVo.getRecursionFlag()){
                case "0" : recursionBoolean = false; break;
                case "1" : recursionBoolean = true; break;
                default: recursionBoolean = false;
            }

            if(StringUtils.isBlank(spiderUrlVo.getUri())){
                throw new IllegalPlatformAugumentException("uri不能为空！");
            }

            UriBO uriBO = new UriBO();
            uriBO.setUri(spiderUrlVo.getUri());

            spiderService.downloadUrl(uriBO,recursionBoolean);


            List<SjzEventIndexTemp> list = (List)lcyjCache.get("EVENT_LIST_TEMP");

            list = list==null ? new ArrayList<>() : list;
            PageVo pageVo = new PageVo();
            pageVo.setCurrentPage(1);
            pageVo.setPageSize(1);
            pageVo.setRecordCount(list.size());
            pageVo.setVoList(list);
            re.setData(pageVo);
            re.setResultCode("0000");
            re.setResultMsg("success");
        }catch (Exception e){
            LOGGER.error("【手动搜索】异常！",e);
            re.setResultCode("9999");
            re.setResultMsg("异常！");
        }
        LOGGER.info("【手动搜索】<--");
        return re;
    }

}
