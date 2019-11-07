package com.hy.designPattern.factory.databaseExample.base;

/**
 * @Author: wanghai
 * @Date:2019/11/7 21:33
 * @Copyright:reach-life
 * @Description:
 */
public class Mysql implements DataBase{
    @Override
    public void open() {
        System.out.println("open mysql");
    }

    @Override
    public void close() {
        System.out.println("close mysql");
    }
}
