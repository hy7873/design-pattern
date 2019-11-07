package com.hy.designPattern.factory.databaseExample.factoryMethod;

import com.hy.designPattern.factory.databaseExample.base.DataBase;
import com.hy.designPattern.factory.databaseExample.base.Mysql;

/**
 * @Author: wanghai
 * @Date:2019/11/7 21:46
 * @Copyright:reach-life
 * @Description:
 */
public class MysqlFactory implements IFactory {
    @Override
    public DataBase get() {
        return new Mysql();
    }
}
