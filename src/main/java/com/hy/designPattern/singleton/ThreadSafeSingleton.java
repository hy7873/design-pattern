package com.hy.designPattern.singleton;

/**
 * @Author: wanghai
 * @Date:2019/9/28 10:53
 * @Copyright:reach-life
 * @Description:线程安全单例
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {

    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

}
