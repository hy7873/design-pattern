package com.hy.designPattern.singleton;

/**
 * @Author: wanghai
 * @Date:2019/9/28 10:47
 * @Copyright:reach-life
 * @Description:静态初始化单例
 */
public class StaticBlockSingleton {

    private static final StaticBlockSingleton instance;


    private StaticBlockSingleton(){

    }

    static {
        instance = new StaticBlockSingleton();
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

}
