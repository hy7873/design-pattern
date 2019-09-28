package com.hy.design_pattern.singleton;

/**
 * @Author: wanghai
 * @Date:2019/9/28 10:45
 * @Copyright:reach-life
 * @Description:提前初始化单例
 */
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return instance;
    }

}
