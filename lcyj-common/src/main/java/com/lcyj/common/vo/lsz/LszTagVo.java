package com.lcyj.common.vo.lsz;

/**
 * @author lcyj
 * @date 2020-11-28 17:04
 * @since
 */
public class LszTagVo{

    /**
     *记录ID,关联表外键
     */
    private Integer recordId;

    /**
     *标签类型：event-事件
     */
    private String tagType;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getTagType() {
        return tagType;
    }

    public void setTagType(String tagType) {
        this.tagType = tagType;
    }
}
