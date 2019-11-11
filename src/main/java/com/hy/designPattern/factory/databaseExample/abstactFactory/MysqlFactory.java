package com.hy.designPattern.factory.databaseExample.abstactFactory;

/**
 * @Author: wanghai
 * @Date:2019/11/7 22:05
 * @Copyright:reach-life
 * @Description:
 */
public class MysqlFactory extends AbstactFactory {
    @Override
    void delete() {
        getDialect().showDialect();
        System.out.println("mysql delete");
    }

    @Override
    void update() {
        getDialect().showDialect();
        System.out.println("mysql update");
    }

    @Override
    void add() {
        getDialect().showDialect();
        System.out.println("mysql add");
    }
}
