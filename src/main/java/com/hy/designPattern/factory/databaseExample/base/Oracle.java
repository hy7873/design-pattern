package com.hy.designPattern.factory.databaseExample.base;

/**
 * @Author: wanghai
 * @Date:2019/11/7 21:35
 * @Copyright:reach-life
 * @Description:
 */
public class Oracle implements DataBase {
    @Override
    public void open() {
        System.out.println("open oracle");
    }

    @Override
    public void close() {
        System.out.println("close oracle");
    }
}
