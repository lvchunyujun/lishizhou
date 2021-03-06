package com.hexiaofei.sjzclient.common;

public class EmailTemplate {

    /**
     * 注册成功提醒邮件
     */
    public static final String REG_CHECK_CODE = "<div style='color:#333333;'>"
            + "<p>亲爱的#PLATFORM_NAME#用户：您好！</p>"
            + "<p>感谢您注册<a href='http://#SERVER_URL#'>#SERVER_URL#</a>，这是您的注册验证码【#CHECK_CODE#】。</p>"
            + "<br />"
            + "<p style='color:#333333;'>请完成您的注册，感谢您对历史轴网站的关注支持！</p>"
            + "<br />"
            + "<p>---------------------------------- </p>"
            + "<p style='color:#333333;'>注：此邮件由#SERVER_NAME#系统自动发送，请勿回复 </p>"
            + "<p style='color:#333333;'>&nbsp;</p>"
            + "<p style='color:#333333;'>&nbsp;</p>"
            + "<p style='color:#333333;'>&copy;2020 #SERVER_URL# | 历史轴 </p>"
            + "</div>";

    /**
     * 忘记密码邮件模版
     */
    public static final String FIND_PASSWORD_CODE = "<div style='color:#333333;'>"
            + "<p>亲爱的#PLATFORM_NAME#用户： **#username# ，您好！</p>"
            + "<p>您在#time#提交了密码重置的请求。</p>"
            + "<p>请您在30分钟内点击下面的链接重设您的密码：</p>"
            + "<br />"
            + "<p>请#<a/>#!(该链接在30分钟内有效)</p>"
            + "<br />"
            + "<p style='color:#333333;'>若您无法直接点击链接，也可复制以下地址到浏览器地址栏中：</p>"
            + "<p style='color:#333333;'>#copyLink#</p>"
            + "<br />"
            + "<p>---------------------------------- </p>"
            + "<p style='color:#333333;'>注：此邮件由#SERVER_URL#系统自动发送，请勿回复 </p>"
            + "<p style='color:#333333;'>&nbsp;</p>"
            + "<p style='color:#333333;'>&nbsp;</p>"
            + "<p style='color:#333333;'>&copy;2020 #SERVER_URL# | 历史轴 </p>"
            + "</div>";
}
