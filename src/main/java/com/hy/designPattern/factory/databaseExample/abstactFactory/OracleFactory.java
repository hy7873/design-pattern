package com.hy.designPattern.factory.databaseExample.abstactFactory;

/**
 * @Author: wanghai
 * @Date:2019/11/7 22:07
 * @Copyright:reach-life
 * @Description:
 */
public class OracleFactory extends AbstactFactory {
    @Override
    void delete() {
        getDialect().showDialect();
        System.out.println("oracle delete");
    }

    @Override
    void update() {
        getDialect().showDialect();
        System.out.println("oracle update");
    }

    @Override
    void add() {
        getDialect().showDialect();
        System.out.println("oracle add");
    }
}
