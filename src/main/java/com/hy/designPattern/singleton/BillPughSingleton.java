package com.hy.designPattern.singleton;

/**
 * @Author: wanghai
 * @Date:2019/9/28 11:00
 * @Copyright:reach-life
 * @Description:bill pugh单例
 */
public class BillPughSingleton {

    private BillPughSingleton() {

    }

    private static class LazyHolder {
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return LazyHolder.instance;
    }

}
