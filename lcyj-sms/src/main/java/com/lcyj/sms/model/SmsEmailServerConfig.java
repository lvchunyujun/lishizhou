package com.lcyj.sms.model;

public class SmsEmailServerConfig {
    /**
     *
     */
    private Integer id;

    /**
     *服务提供商名称
     */
    private String serverProvider;

    /**
     *协议
     */
    private String protocol;

    /**
     *服务地址
     */
    private String address;

    /**
     *端口号
     */
    private String port;

    /**
     *描述
     */
    private String description;

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
     *服务提供商名称
     */
    public String getServerProvider() {
        return serverProvider;
    }

    /**
     *服务提供商名称
     */
    public void setServerProvider(String serverProvider) {
        this.serverProvider = serverProvider == null ? null : serverProvider.trim();
    }

    /**
     *协议
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     *协议
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol == null ? null : protocol.trim();
    }

    /**
     *服务地址
     */
    public String getAddress() {
        return address;
    }

    /**
     *服务地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     *端口号
     */
    public String getPort() {
        return port;
    }

    /**
     *端口号
     */
    public void setPort(String port) {
        this.port = port == null ? null : port.trim();
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