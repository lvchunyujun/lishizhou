package com.hexiaofei.provider0.domain;

public class LszTag {
    /**
     *标签ID
     */
    private Integer tagId;

    /**
     *记录ID,关联表外键
     */
    private Integer recordId;

    /**
     *标签类型：event-事件
     */
    private String tagType;

    /**
     *单词编码
     */
    private Integer wordMetaCode;

    /**
     *单词英文
     */
    private String wordMetaEn;

    /**
     *单词中文
     */
    private String wordMetaZh;

    /**
     *标签ID
     */
    public Integer getTagId() {
        return tagId;
    }

    /**
     *标签ID
     */
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    /**
     *记录ID,关联表外键
     */
    public Integer getRecordId() {
        return recordId;
    }

    /**
     *记录ID,关联表外键
     */
    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    /**
     *标签类型：event-事件
     */
    public String getTagType() {
        return tagType;
    }

    /**
     *标签类型：event-事件
     */
    public void setTagType(String tagType) {
        this.tagType = tagType == null ? null : tagType.trim();
    }

    /**
     *单词编码
     */
    public Integer getWordMetaCode() {
        return wordMetaCode;
    }

    /**
     *单词编码
     */
    public void setWordMetaCode(Integer wordMetaCode) {
        this.wordMetaCode = wordMetaCode;
    }

    /**
     *单词英文
     */
    public String getWordMetaEn() {
        return wordMetaEn;
    }

    /**
     *单词英文
     */
    public void setWordMetaEn(String wordMetaEn) {
        this.wordMetaEn = wordMetaEn == null ? null : wordMetaEn.trim();
    }

    /**
     *单词中文
     */
    public String getWordMetaZh() {
        return wordMetaZh;
    }

    /**
     *单词中文
     */
    public void setWordMetaZh(String wordMetaZh) {
        this.wordMetaZh = wordMetaZh == null ? null : wordMetaZh.trim();
    }

    @Override
    public String toString() {
        return "LszTag{" +
                "tagId=" + tagId +
                ", recordId=" + recordId +
                ", tagType='" + tagType + '\'' +
                ", wordMetaCode=" + wordMetaCode +
                ", wordMetaEn='" + wordMetaEn + '\'' +
                ", wordMetaZh='" + wordMetaZh + '\'' +
                '}';
    }
}