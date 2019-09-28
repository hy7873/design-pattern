package com.hy.design_pattern.singleton;

/**
 * @Author: wanghai
 * @Date:2019/9/28 10:56
 * @Copyright:reach-life
 * @Description:双重检查锁定单例
 */
public class DoubleCheckLockingSingleton {

    private static DoubleCheckLockingSingleton instance;

    private DoubleCheckLockingSingleton() {

    }

    public static DoubleCheckLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLockingSingleton.class) {
                instance = new DoubleCheckLockingSingleton();
            }
        }
        return instance;
    }
}
