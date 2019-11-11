package com.hy.designPattern.strategy;


/**
 * @Author: wanghai
 * @Date:2019/9/30 10:53
 * @Copyright:reach-life
 * @Description:
 */
@ActiviyTypeAnnotation(activityType = ActivityTypeEnum.ICBC_ETC)
public class IcbcETCActivityStrategy extends AbstractActivityStrategy{

    @Override
    public void process(String activityType) {
        System.out.println("处理工行etc活动");
    }
}
