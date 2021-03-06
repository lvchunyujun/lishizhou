package com.hexiaofei.sjzclient.common;

public interface WebSystemConsts {


    String COOKIE_USER = "USERINFO";


    String DFAULT_PASSWORD = "000000";

    /** 登录成功欢迎页 */
    String WELCOME_INDEX_URL = "/my/index";

    /** 首页索引 */
    String INDEX_URL = "/index";

    /** URL: 跳转登录页面 */
    String TO_LOGIN_URL = "/toLogin";
    /** URL: 跳转注册*/
    String TO_SIGN_IN = "/toRegistor";
    /** URL: 注册*/
    String SIGN_IN = "/registor";
    /** URL: 注册成功 */
    String SIGN_IN_OK = "/registor_ok";
    /** URL: 登录 */
    String LOGIN_URL   = "/login";
    /** URL: 注销登录 */
    String LOGOUT_URL  = "/logout";
    /** URL: 异常跳转 */
    String ERROR_URL   = "/error";
    /** URL: 静态资源*/
    String STATIC_URL  = "/static/**";
    /** URL: 发送注册码 */
    String SEND_CHECK_CODE = "/sendCheckCode";
    /** URL: 图片验证码 */
    String IMG_VERIFY_CODE = "/verifyImg";

    /** 找回密码 */
    String FIND_PASSWORD = "/findPasswd/**";
    /** URL: 找回密码-忘记密码 */
    String FW_FORGET_PASSWD = "/findPasswd/**";
    /** URL: 找回密码-核实账号 */
    String FW_VERIFY_ACCOUNT = "/verifyAccount";
    /** URL: 找回密码-发送验证码 */
    String FW_SEND_CHECKCODE = "/sendCheckCode";
    /** URL: 找回密码-设置密码 */
    String FW_SET_PASSWD = "/setPasswd";
    /** URL: 找回密码-修改密码 */
    String FW_RESET_PASSWD = "/resetPasswd";


}
