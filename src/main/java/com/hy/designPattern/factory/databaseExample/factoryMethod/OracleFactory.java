package com.hy.designPattern.factory.databaseExample.factoryMethod;

import com.hy.designPattern.factory.databaseExample.base.DataBase;
import com.hy.designPattern.factory.databaseExample.base.Oracle;

/**
 * @Author: wanghai
 * @Date:2019/11/7 21:49
 * @Copyright:reach-life
 * @Description:
 */
public class OracleFactory implements IFactory{
    @Override
    public DataBase get() {
        return new Oracle();
    }
}
