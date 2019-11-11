package com.hy.designPattern.strategy;


/**
 * @Author: wanghai
 * @Date:2019/9/30 10:53
 * @Copyright:reach-life
 * @Description:
 */
@ActiviyTypeAnnotation(activityType = ActivityTypeEnum.CCB_VOLUNTEER)
public class CcbVolunteerActivityStrategy extends AbstractActivityStrategy{

    @Override
    public void process(String activityType) {
        System.out.println("处理建行志愿者活动");
    }
}
