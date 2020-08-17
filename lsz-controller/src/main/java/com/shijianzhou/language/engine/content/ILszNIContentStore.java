package com.shijianzhou.language.engine.content;

import com.hexiaofei.provider0.domain.SjzEventIndexTemp;

import java.util.Map;

/**
 * 解析内容存储接口 <br/>
 *
 * @author lcyj
 * @date 2020-08-16 22:21
 * @since
 */
public interface ILszNIContentStore {

    void saveContent(Map<String,Object> map);
}
