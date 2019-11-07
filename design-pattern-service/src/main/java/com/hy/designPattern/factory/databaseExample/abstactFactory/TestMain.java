package com.hy.designPattern.factory.databaseExample.abstactFactory;

/**
 * @Author: wanghai
 * @Date:2019/11/7 22:12
 * @Copyright:reach-life
 * @Description:
 */
public class TestMain {
    public static void main(String[] args) {
        AbstactFactory abstactFactory = DatabaseFactory.getAbstactFactory(DatabaseFactoryType.MYSQL);
        abstactFactory.setDialect(DialectType.MYSQLDialect);
        abstactFactory.add();
    }
}
