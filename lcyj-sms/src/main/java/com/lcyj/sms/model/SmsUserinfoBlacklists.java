package com.lcyj.sms.model;

import java.util.Date;

public class SmsUserinfoBlacklists {
    /**
     *ID
     */
    private Integer id;

    /**
     *黑名单用户ID
     */
    private String smsUserId;

    /**
     *黑名单用户名称
     */
    private String userName;

    /**
     *黑名单开始日期
     */
    private Date startDateTime;

    /**
     *黑名单结束日期
     */
    private Date endDateTime;

    /**
     *限制类型：email、mobileNo
     */
    private String limitType;

    /**
     *记录创建日期
     */
    private Date createTime;

    /**
     *描述
     */
    private String description;

    /**
     *平台ID
     */
    private String plantformId;

    /**
     *平台服务ID
     */
    private String serverId;

    /**
     *ID
     */
    public Integer getId() {
        return id;
    }

    /**
     *ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *黑名单用户ID
     */
    public String getSmsUserId() {
        return smsUserId;
    }

    /**
     *黑名单用户ID
     */
    public void setSmsUserId(String smsUserId) {
        this.smsUserId = smsUserId == null ? null : smsUserId.trim();
    }

    /**
     *黑名单用户名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     *黑名单用户名称
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     *黑名单开始日期
     */
    public Date getStartDateTime() {
        return startDateTime;
    }

    /**
     *黑名单开始日期
     */
    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    /**
     *黑名单结束日期
     */
    public Date getEndDateTime() {
        return endDateTime;
    }

    /**
     *黑名单结束日期
     */
    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     *限制类型：email、mobileNo
     */
    public String getLimitType() {
        return limitType;
    }

    /**
     *限制类型：email、mobileNo
     */
    public void setLimitType(String limitType) {
        this.limitType = limitType == null ? null : limitType.trim();
    }

    /**
     *记录创建日期
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *记录创建日期
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     *描述
     */
    public String getDescription() {
        return description;
    }

    /**
     *描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     *平台ID
     */
    public String getPlantformId() {
        return plantformId;
    }

    /**
     *平台ID
     */
    public void setPlantformId(String plantformId) {
        this.plantformId = plantformId == null ? null : plantformId.trim();
    }

    /**
     *平台服务ID
     */
    public String getServerId() {
        return serverId;
    }

    /**
     *平台服务ID
     */
    public void setServerId(String serverId) {
        this.serverId = serverId == null ? null : serverId.trim();
    }
}