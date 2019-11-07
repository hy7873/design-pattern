package com.hy.designPattern.factory.databaseExample.abstactFactory;

/**
 * @Author: wanghai
 * @Date:2019/11/7 21:57
 * @Copyright:reach-life
 * @Description:
 */
public class MysqlDialect implements IDialect {
    @Override
    public void showDialect() {
        System.out.println("mysql showDialect");
    }
}
