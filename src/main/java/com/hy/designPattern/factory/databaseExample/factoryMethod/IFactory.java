package com.hy.designPattern.factory.databaseExample.factoryMethod;

import com.hy.designPattern.factory.databaseExample.base.DataBase;

/**
 * @Author: wanghai
 * @Date:2019/11/7 21:45
 * @Copyright:reach-life
 * @Description:
 */
public interface IFactory {

    public DataBase get();
}
