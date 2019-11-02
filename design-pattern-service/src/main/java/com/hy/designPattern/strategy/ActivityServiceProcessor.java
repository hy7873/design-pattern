package com.hy.designPattern.strategy;

import com.hy.util.SpringBeanUntils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Author: wanghai
 * @Date:2019/9/30 10:58
 * @Copyright:reach-life
 * @Description:
 */
@Service
public class ActivityServiceProcessor {

    public void process(String activityType) {
        Map<String,AbstractActivityStrategy> beanMap = SpringBeanUntils.getBeanMap(AbstractActivityStrategy.class);
        for (Map.Entry<String,AbstractActivityStrategy> entry : beanMap.entrySet()) {
            ActiviyTypeAnnotation annotation =  entry.getValue().getClass().getAnnotation(ActiviyTypeAnnotation.class);
            String actCode = annotation.activityType().getCode();
            if (actCode.equals(activityType)) {
                entry.getValue().process(activityType);
            }
            System.out.println(annotation.activityType().getCode());
        }
    }

}
