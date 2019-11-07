package com.hy.designPattern.factory.databaseExample.factoryMethod;

import com.hy.designPattern.factory.databaseExample.base.DataBase;

/**
 * @Author: wanghai
 * @Date:2019/11/7 21:49
 * @Copyright:reach-life
 * @Description:
 */
public class TestMain {
    public static void main(String[] args) {
        DataBase dataBase = new MysqlFactory().get();
        dataBase.open();
    }
}
