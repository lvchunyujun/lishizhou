package com.lcyj.common.utils.cache;

import java.util.HashMap;
import java.util.Map;

/**
 * 自定义缓存 <br/>
 *
 * @author lcyj
 * @date 2020-08-01 15:45
 * @since
 */
public class LcyjCache {

    private static LcyjCache lcyjCache;
    private static Map<String,Object> cacheMap ;

    private LcyjCache(){}

    static{
        init();
    }

    private static synchronized void init(){
        if(cacheMap == null){
            cacheMap = new HashMap<String,Object>();
        }
    }

    public static  LcyjCache getInstance(){
        if(lcyjCache == null){
            lcyjCache = new LcyjCache();
        }
        return lcyjCache;
    }

    public synchronized void set(String key,Object value){
        cacheMap.put(key,value);
    }

    public Object get(String key){
        return cacheMap.get(key);
    }

}
