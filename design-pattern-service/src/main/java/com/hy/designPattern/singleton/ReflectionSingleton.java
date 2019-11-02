package com.hy.designPattern.singleton;

/**
 * @Author: wanghai
 * @Date:2019/9/28 11:08
 * @Copyright:reach-life
 * @Description:防止反射单例
 */
public class ReflectionSingleton {

    private static ReflectionSingleton instance;

    private ReflectionSingleton() {
        throw new InstantiationError("不要通过反射获取实例");
    }
    public static synchronized ReflectionSingleton getInstance() {
        if (instance == null) {
            instance = new ReflectionSingleton();
        }
        return instance;
    }

}
