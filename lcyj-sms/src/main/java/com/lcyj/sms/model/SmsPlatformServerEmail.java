package com.lcyj.sms.model;

public class SmsPlatformServerEmail {
    /**
     *
     */
    private Integer id;

    /**
     *平台ID
     */
    private String platformId;

    /**
     *平台服务ID
     */
    private String serverId;

    /**
     *平台名称
     */
    private String platformName;

    /**
     *email
     */
    private String emailAddress;

    /**
     *email_password
     */
    private String emailPassword;

    /**
     *email服务配置ID外键关联
     */
    private String emailServerConfigId;

    /**
     *交易类型
     */
    private String businessType;

    /**
     *交易名称
     */
    private String businessName;

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
     *平台ID
     */
    public String getPlatformId() {
        return platformId;
    }

    /**
     *平台ID
     */
    public void setPlatformId(String platformId) {
        this.platformId = platformId == null ? null : platformId.trim();
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

    /**
     *平台名称
     */
    public String getPlatformName() {
        return platformName;
    }

    /**
     *平台名称
     */
    public void setPlatformName(String platformName) {
        this.platformName = platformName == null ? null : platformName.trim();
    }

    /**
     *email
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     *email
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress == null ? null : emailAddress.trim();
    }

    /**
     *email_password
     */
    public String getEmailPassword() {
        return emailPassword;
    }

    /**
     *email_password
     */
    public void setEmailPassword(String emailPassword) {
        this.emailPassword = emailPassword == null ? null : emailPassword.trim();
    }

    /**
     *email服务配置ID外键关联
     */
    public String getEmailServerConfigId() {
        return emailServerConfigId;
    }

    /**
     *email服务配置ID外键关联
     */
    public void setEmailServerConfigId(String emailServerConfigId) {
        this.emailServerConfigId = emailServerConfigId == null ? null : emailServerConfigId.trim();
    }

    /**
     *交易类型
     */
    public String getBusinessType() {
        return businessType;
    }

    /**
     *交易类型
     */
    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    /**
     *交易名称
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     *交易名称
     */
    public void setBusinessName(String businessName) {
        this.businessName = businessName == null ? null : businessName.trim();
    }
}