package com.lcyj.sms.model;

public class SmsPlatformServer {
    /**
     *ID
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
     *平台服务名称
     */
    private String serverName;

    /**
     *平台服务ID
     */
    private String serverIp;

    /**
     *平台服务url
     */
    private String serverUrl;

    /**
     *描述
     */
    private String description;

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
     *平台服务名称
     */
    public String getServerName() {
        return serverName;
    }

    /**
     *平台服务名称
     */
    public void setServerName(String serverName) {
        this.serverName = serverName == null ? null : serverName.trim();
    }

    /**
     *平台服务ID
     */
    public String getServerIp() {
        return serverIp;
    }

    /**
     *平台服务ID
     */
    public void setServerIp(String serverIp) {
        this.serverIp = serverIp == null ? null : serverIp.trim();
    }

    /**
     *平台服务url
     */
    public String getServerUrl() {
        return serverUrl;
    }

    /**
     *平台服务url
     */
    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl == null ? null : serverUrl.trim();
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
}