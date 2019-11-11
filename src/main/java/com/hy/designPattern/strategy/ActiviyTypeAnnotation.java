package com.hy.designPattern.strategy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: wanghai
 * @Date:2019/9/30 10:49
 * @Copyright:reach-life
 * @Description:活动类型
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ActiviyTypeAnnotation {

    ActivityTypeEnum activityType();

}
