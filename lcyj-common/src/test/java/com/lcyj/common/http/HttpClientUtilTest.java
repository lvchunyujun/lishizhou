package com.lcyj.common.http;

import org.apache.http.HttpEntity;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class HttpClientUtilTest {

    @Test
    public void sendGet() {
        String reuslt = HttpClientUtil.sendGet("https://www.jd.com");
        System.out.println(reuslt);
        Assert.assertNotEquals("get request failed !","200",reuslt);
    }

    @Test
    public void sendPost() {
        HttpEntity httpEntity = HttpClientUtil.sendPost("https://www.jd.com",new HashMap());
        Assert.assertEquals("","200",httpEntity.toString());
    }
}