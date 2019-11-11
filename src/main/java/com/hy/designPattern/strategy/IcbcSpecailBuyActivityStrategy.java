package com.hy.designPattern.strategy;


/**
 * @Author: wanghai
 * @Date:2019/9/30 10:53
 * @Copyright:reach-life
 * @Description:
 */
@ActiviyTypeAnnotation(activityType = ActivityTypeEnum.ICBC_SPECIAL_BUY)
public class IcbcSpecailBuyActivityStrategy extends AbstractActivityStrategy{

    @Override
    public void process(String activityType) {
        System.out.println("处理工行优惠购买活动");
    }
}
