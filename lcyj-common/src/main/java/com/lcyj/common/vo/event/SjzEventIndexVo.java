package com.lcyj.common.vo.event;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.lcyj.common.vo.PageVo;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SjzEventIndexVo {

    /**
     *
     */
    private Integer id;

    /**
     *事件发生事件:<br/>
     * 注意：为防止1900-1-1日之前日期JodaTime转换不一致问题，使用字符串
     */
    private String eventTime;

    /**
     *主页显示文章索引内容
     */
    private String eventContent;

    /**
     *类型：0:文本 默认，20: 超链接
     */
    private Byte eventType;

    /**
     *状态：0:发布，10:待审核(默认)，20:审核通过 30:审核禁止
     */
    private Byte eventState;

    /**
     *创建记录事件
     */
    private Date recordCreateTime;

    /** 开始时间 */
    @DateTimeFormat(pattern = "yyyy-MM-dd",iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date startDate;

    /** 结束时间 */
    @DateTimeFormat(pattern = "yyyy-MM-dd",iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date endDate;

    private PageVo pageVo;

    /**
     *单词编码
     */
    private Integer wordMetaCode;

    /**
     *单词中文
     */
    private String wordMetaZh;

    /**
     *
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *事件发生事件
     */
    public String getEventTime() {
        return eventTime;
    }

    /**
     *事件发生事件
     */
    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    /**
     *主页显示文章索引内容
     */
    public String getEventContent() {
        return eventContent;
    }

    /**
     *主页显示文章索引内容
     */
    public void setEventContent(String eventContent) {
        this.eventContent = eventContent == null ? null : eventContent.trim();
    }

    /**
     *类型：0:文本 默认，20: 超链接
     */
    public Byte getEventType() {
        return eventType;
    }

    /**
     *类型：0:文本 默认，20: 超链接
     */
    public void setEventType(Byte eventType) {
        this.eventType = eventType;
    }

    /**
     *状态：0:正常 默认，10:不显示
     */
    public Byte getEventState() {
        return eventState;
    }

    /**
     *状态：0:正常 默认，10:不显示
     */
    public void setEventState(Byte eventState) {
        this.eventState = eventState;
    }

    /**
     *创建记录事件
     */
    public Date getRecordCreateTime() {
        return recordCreateTime;
    }

    /**
     *创建记录事件
     */
    public void setRecordCreateTime(Date recordCreateTime) {
        this.recordCreateTime = recordCreateTime;
    }

    public PageVo getPageVo() {
        return pageVo;
    }

    public void setPageVo(PageVo pageVo) {
        this.pageVo = pageVo;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getWordMetaCode() {
        return wordMetaCode;
    }

    public void setWordMetaCode(Integer wordMetaCode) {
        this.wordMetaCode = wordMetaCode;
    }

    public String getWordMetaZh() {
        return wordMetaZh;
    }

    public void setWordMetaZh(String wordMetaZh) {
        this.wordMetaZh = wordMetaZh;
    }
}
