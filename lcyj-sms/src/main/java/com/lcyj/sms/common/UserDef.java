package com.lcyj.sms.common;


import com.lcyj.sms.model.CreditLevel;

import java.math.BigDecimal;

/**
 * 用户常量定义
 * 
 * 
 */
public interface UserDef
{

	/**
	 * 信用等级
	 * @author lenovo
	 *
	 */
    public enum CREDIT_LEVEL {
    	A("AA", 1, 500, 800, new BigDecimal("0.00")),B("A", 2, 250, 499, new BigDecimal("0.00")),C("B", 3, 220, 249, new BigDecimal("1.50")),D("D", 5, 169, 189, new BigDecimal("2.50")),E("E", 6, 130, 159, new BigDecimal("3.00")),HR("HR", 7, 0, 129, new BigDecimal("5.00"));
    	private CreditLevel level;
    	CREDIT_LEVEL(String l,int a,int b,int c,BigDecimal d) {
    		this.level = new CreditLevel(l, a, b, c, d);
    	}
    	public CreditLevel getValue() {
    		return this.level;
    	}
    }


    /**
     * 用户角色-系统账户
     */
    short ROLE_BANK = 0;
    /** 用户角色-投资人 */
    short ROLE_INVESTOR = 1;
    /** 用户角色-借款人 */
    short ROLE_BORROWER = 2;
    /** 用户角色-投资人(内部投资人)*/
    short ROLE_INSIDE_INVESTOR = 3;

    boolean GENDER_MALE = true;

    boolean GENDER_FEMALE = false;

    /**
     * 系统中转账户的用户id
     */
    @Deprecated
    int COMPANY_TRANSIT_USER_ID = 1;

    /**
     * 系统中转账户的用户昵称
     */
    @Deprecated
    String COMPANY_TRANSIT_USER_NICKNAME = CommonDef.WEBSITE_NAME_CN+"账户";

    /**
     * 系统风险保证金账户的用户id
     */
    @Deprecated
    int COMPANY_RISK_ACCOUNT_USER_ID = 2;

    /**
     * 系统风险保证金账户的用户昵称
     */
    @Deprecated
    String COMPANY_RISK_ACCOUNT_USER_NICKNAME = "风险保证金账户";

    /**
     * 平台收入账户的用户id
     */
    @Deprecated
    int COMPANY_PLATFORM_INCOME_USER_ID = 3;

    /**
     * 平台收入账户的用户昵称
     */
    @Deprecated
    String COMPANY_PLATFORM_INCOME_USER_NICKNAME = "平台手续费";

    /**
     * 首信易充值影子账户的用户id
     */
    @Deprecated
    int COMPANY_PLATFORM_RECHARGE_USER_ID = 4;

    /**
     * 首信易充值影子账户的用户昵称
     */
    @Deprecated
    String COMPANY_PLATFORM_RECHARGE_USER_NICKNAME = "首信易充值影子账户";

    /**
     * 提现影子账户的用户id
     */
    @Deprecated
    int COMPANY_PLATFORM_WITHDRAW_USER_ID = 5;

    /**
     * 提现影子账户的用户昵称
     */
    @Deprecated
    String COMPANY_PLATFORM_WITHDRAW_USER_NICKNAME = "提现影子账户";

    /**
     * 富友银行代扣账户的用户id
     */
    @Deprecated
    int COMPANY_PLATFORM_WITHHOLD_USER_ID = 6;

    /**
     * 富友银行代扣账户的用户昵称
     */
    @Deprecated
    String COMPANY_PLATFORM_WITHHOLD_USER_NICKNAME = "首信易代扣账户";


    /**
     * 平台手续费账户的用户id（针对债权交易）
     */
    @Deprecated
    int COMPANY_PLATFORM_TRADE_INCOME_USER_ID = 9;

    /**
     * 平台手续费账户的用户昵称（针对债权交易）
     */
    @Deprecated
    String COMPANY_PLATFORM_TRADE_INCOME_USER_NICKNAME = "平台手续费账户";


    /**
     * 刚注册，没通过任何验证
     */
    short STATUS_NEW_REGISTERED = 0;

    /**
     * 只通过邮件验证
     */
    short STATUS_ONLY_MAIL = 10;

    /**
     * 邮件+手机验证
     */
    short STATUS_MAIL_MOBILE = 20;

    /**
     * 邮件+手机+身份证
     */
    short STATUS_MAIL_MOBILE_ID = 30;

    /**
     * 没有任何禁止项目
     */
    short FORBID_STATUS_NEW_REGISTERED = 0;

    /**
     * 禁止评论
     */
    short FORBID_STATUS_NO_COMMENT = 10;

    /**
     * 禁止投标
     */
    short FORBID_STATUS_NO_INVEST = 20;

    /**
     * 禁止借款
     */
    short FORBID_STATUS_NO_BORROW = 30;

    /**
     * 禁止评论，借入
     */
    short FORBID_STATUS_NO_COMMENT_BORROW = 40;

    /**
     * 禁止评论，投标
     */
    short FORBID_STATUS_NO_COMMENT_INVEST = 50;

    /**
     * 禁止评论，投标和借入
     */
    short FORBID_STATUS_NO_COMMENT_INVEST_BORROW = 60;

    /**
     * 教育水平
     */
    String[][] EDU_LEVEL = { { "10", "小学" }, { "20", "初中" }, { "30", "中专" }, { "40", "高中" },
            { "50", "大专" }, { "60", "本科" }, { "70", "硕士" }, { "80", "博士" }, { "90", "其他" } };

    /**
     * 联系人与借款人关系－父母
     */
    short CONTACT_RELEATION_PARENTS = 100;

    /**
     * 联系人与借款人关系－夫妻，配偶
     */
    short CONTACT_RELEATION_SPOUSE = 200;

    /**
     * 联系人与借款人关系－子女
     */
    short CONTACT_RELEATION_CHILDREN = 300;

    /**
     * 联系人与借款人关系－兄弟姐妹
     */
    short CONTACT_RELEATION_BROTHER_SISTER = 400;

    /**
     * 联系人与借款人关系－朋友
     */
    short CONTACT_RELEATION_FRIEND = 500;

    /**
     * 联系人与借款人关系－同学
     */
    short CONTACT_RELEATION_CLASSMATE = 600;

    /**
     * 联系人与借款人关系－同事
     */
    short CONTACT_RELEATION_COLLEAGUE = 700;

    /**
     * 联系人与借款人关系－老师
     */
    short CONTACT_RELEATION_TEACHURE = 800;

    /**
     * 联系人与借款人关系－其他
     */
    short CONTACT_RELEATION_OTHER = 900;


}
