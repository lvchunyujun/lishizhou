package com.shijianzhou.process;

import com.hexiaofei.provider0.common.consts.SjzSystemConsts;
import com.shijianzhou.language.engine.content.ISjzNlContentConsume;
import com.shijianzhou.language.engine.content.SjzNlContentConsumeFactory;
import com.shijianzhou.language.engine.content.SjzNlMapStringContentConsumeFactory;
import com.shijianzhou.process.entity.HtmlJsoupResource;
import com.shijianzhou.process.entity.IResource;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Page;

import java.util.HashMap;
import java.util.Map;

/**
 * <br/>
 *
 * @author lcyj
 * @date 2020-07-25 23:09
 * @since
 */

@Component("htmlTagResourceResolve")
public class HtmlTagResourceResolve implements IResourceResolve {

    @Override
    public void resolve(IResource resource) {
        HtmlJsoupResource htmlJsoupResource = ((HtmlJsoupResource)resource);

        // uri
        String uri = htmlJsoupResource.getUri();
        Element element = htmlJsoupResource.getElement();
        // 返回标签自己的文本内容
        String tagContent = element.ownText();

        doConsumeContent(uri,tagContent);
    }

    /**
     * 消费String内容
     * @param uri
     * @param tagContent
     */
    private void doConsumeContent(String uri, String tagContent){

        if(StringUtils.isNotBlank(tagContent)) {
            SjzNlContentConsumeFactory contentConsumeFactory = new SjzNlMapStringContentConsumeFactory();
            ISjzNlContentConsume contentConsume = ((SjzNlMapStringContentConsumeFactory) contentConsumeFactory).getContentCacheConsume();

            Map<String, Object> sourceMap = new HashMap<>();
            sourceMap.put(SjzSystemConsts.CONSUME_SOURCE_MAP_URL, uri);
            sourceMap.put(SjzSystemConsts.CONSUME_SOURCE_MAP_TXT, tagContent);

            contentConsume.doProcess(sourceMap);
        }
    }
}
