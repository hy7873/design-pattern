package com.hy.designPattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: wanghai
 * @Date:2019/9/28 11:12
 * @Copyright:reach-life
 * @Description:
 */
public class TestReflectionSingleton {

    public static void main(String[] args) {
        ReflectionSingleton reflectionSingleton1 = ReflectionSingleton.getInstance();
        ReflectionSingleton reflectionSingleton2 = null;
        try {
            Constructor constructor = ReflectionSingleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            reflectionSingleton2 = (ReflectionSingleton) constructor.newInstance();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println(reflectionSingleton1);
        System.out.println(reflectionSingleton2);
    }

}
