package com.hy.designPattern.singleton;

/**
 * @Author: wanghai
 * @Date:2019/9/28 10:50
 * @Copyright:reach-life
 * @Description:延迟初始化单例
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
