package com.lcyj.common.consts;

/**
 * 标签类型
 * <br/>
 *
 * @author lcyj
 * @date 2020-11-28 14:49
 * @since
 */
public enum TagTypeEnum {

    /** 开启 */
    EVENT("event","事件"),
    /** 关闭 */;

    private final String tagType;
    private final String tagTypeDesc;

    TagTypeEnum(String tagType, String tagTypeDesc) {
        this.tagType = tagType;
        this.tagTypeDesc = tagTypeDesc;
    }

    public String getTagType() {
        return tagType;
    }

    public String getTagTypeDesc() {
        return tagTypeDesc;
    }
}
