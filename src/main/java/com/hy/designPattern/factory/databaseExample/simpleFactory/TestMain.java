package com.hy.designPattern.factory.databaseExample.simpleFactory;

import com.hy.designPattern.factory.databaseExample.base.DataBase;

/**
 * @Author: wanghai
 * @Date:2019/11/7 21:40
 * @Copyright:reach-life
 * @Description:
 */
public class TestMain {

    public static void main(String[] args) {
        DataBase dataBase1 = Factory.getDataBase(Factory.DataBaseType.MYSQL);
        dataBase1.open();
        DataBase dataBase2 = Factory.getDataBase(Factory.DataBaseType.ORACLE);
        dataBase2.open();
    }
}
