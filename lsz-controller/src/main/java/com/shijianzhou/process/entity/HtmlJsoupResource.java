package com.shijianzhou.process.entity;


import org.jsoup.nodes.Element;

/**
 * Html资源 <br/>
 *
 * @author lcyj
 * @date 2020-08-16 21:35
 * @since
 */
public class HtmlJsoupResource implements IResource {

    private Element element;

    private String uri;

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
