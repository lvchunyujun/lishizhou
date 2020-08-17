package com.shijianzhou.language.engine.content;

import com.hexiaofei.provider0.domain.SjzEventIndex;
import com.hexiaofei.provider0.domain.SjzEventIndexTemp;
import com.lcyj.common.utils.cache.LcyjCache;
import com.shijianzhou.language.domain.SjzNlRelatePatternUnit;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 解析内容放入缓存消费 <br/>
 *
 * @author lcyj
 * @date 2020-08-16 22:00
 * @since
 */
@Component
public class SjzNlMapStringContentCacheConsume extends SjzNlMapStringContentConsume {

    private final static String EVENT_LIST_TEMP = "EVENT_LIST_TEMP";

    @Override
    public void saveContent(Map<String,Object> map) {

        Date eventDate = (Date) map.get(EnumContentMap.EVENT_DATE.getKey());
        String eventContent = (String)map.get(EnumContentMap.EVENT_CONTENT.getKey());
        String url = (String)map.get(EnumContentMap.URL.getKey());
        SjzNlRelatePatternUnit rpu = (SjzNlRelatePatternUnit)map.get(EnumContentMap.RPU.getKey());
        boolean rpuFlag = (boolean)map.get(EnumContentMap.RPU_FLAG.getKey());

        // 是否匹配到结果
        if(rpuFlag){

            // 获取缓存对象
            LcyjCache lcyjCache = LcyjCache.getInstance();
            List<SjzEventIndexTemp> list = (List)lcyjCache.get(EVENT_LIST_TEMP);
            if(list==null){
                list = new ArrayList<>();
            }

            SjzEventIndexTemp sjzEventIndexTemp = mappingEventIndexTempBo( eventDate,url,eventContent,rpu);
            list.add(sjzEventIndexTemp);
            lcyjCache.set(EVENT_LIST_TEMP,list);
        }
    }


}
