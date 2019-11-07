package com.hy.designPattern.factory.databaseExample.abstactFactory;

/**
 * @Author: wanghai
 * @Date:2019/11/7 21:58
 * @Copyright:reach-life
 * @Description:
 */
public class OracleDialect implements IDialect {
    @Override
    public void showDialect() {
        System.out.println("oracle showDialect");
    }
}
