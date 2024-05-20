package com.lcyj.sms.common;

/**
 *
 *  Administrator
 */
public enum EmailTypeEnum {

    /** 注册激活_密码找回 */
    REG_PASSWD("REG_PASSWD","注册激活_密码找回") {
        @Override
        public String toString() {
            return "注册激活";
        }
    },
    FIND_PASSWORD_CODE("FIND_PASSWORD_CODE","找回密码"){
        @Override
        public String toString() {
            return "找回密码";
        }
    },
    /** 其他 */
    OTHER("OTHER","其他") {

        @Override
        public String toString() {
            return "其他";
        }
    };

    String code;
    String type;

    EmailTypeEnum(String code,String type){
        this.code = code;
        this.type = type;
    }

    // 普通方法
    public static EmailTypeEnum getEmailType(String emailType) {
        EmailTypeEnum target = null;
        switch (emailType){
            case "REG_PASSWD": target = EmailTypeEnum.REG_PASSWD; break;
            default: target = EmailTypeEnum.OTHER;
        }
        return target;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public abstract String toString();

    public static void main(String[] args) {
        System.out.println(EmailTypeEnum.getEmailType("REG_PASSWD"));
    }
}
