package com.hexiaofei.provider0.vo;

/**
 * 抓取URL查询条件VO <br/>
 *
 * @author lcyj
 * @date 2020-08-17 00:04
 * @since
 */
public class SpiderUrlVo {

    private String uri;

    private String recursionFlag;

    private PageVo pageVo;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getRecursionFlag() {
        return recursionFlag;
    }

    public void setRecursionFlag(String recursionFlag) {
        this.recursionFlag = recursionFlag;
    }

    public PageVo getPageVo() {
        return pageVo;
    }

    public void setPageVo(PageVo pageVo) {
        this.pageVo = pageVo;
    }
}
