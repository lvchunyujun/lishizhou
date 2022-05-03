package com.hexiaofei.provider0.service;

import com.hexiaofei.provider0.domain.LszTag;
import com.hexiaofei.provider0.service.base.BaseService;
import com.hexiaofei.provider0.service.base.IBaseService;
import org.jsoup.Connection;

/**
 * <br/>
 *
 * @author lcyj
 * @date 2020-11-28 15:12
 * @since
 */
public interface ILszTagService extends IBaseService<LszTag> {

    /**
     * 根据 recordId/tagType查询
     * @param lszTag
     * @return
     */
    LszTag getLszTag(LszTag lszTag);
}
