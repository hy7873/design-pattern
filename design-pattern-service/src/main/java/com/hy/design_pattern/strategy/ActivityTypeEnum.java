package com.hy.design_pattern.strategy;

/**
 * @Author: wanghai
 * @Date:2019/9/30 10:42
 * @Copyright:reach-life
 * @Description:活动类型枚举
 */
public enum  ActivityTypeEnum {

    ICBC_ETC("icbcETC","工行ETC"),

    CCB_VOLUNTEER("ccbVolunteer","建行志愿者"),

    ICBC_SPECIAL_BUY("icbcSpecialBuy","工行优惠购买");

    private String code;

    private String name;

    ActivityTypeEnum(String code,String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
