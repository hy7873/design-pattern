package com.hy.designPattern.factory.databaseExample.simpleFactory;

import com.hy.designPattern.factory.databaseExample.base.DataBase;
import com.hy.designPattern.factory.databaseExample.base.Mysql;
import com.hy.designPattern.factory.databaseExample.base.Oracle;

/**
 * @Author: wanghai
 * @Date:2019/11/7 21:35
 * @Copyright:reach-life
 * @Description:
 */
public class Factory {

    enum DataBaseType {
        MYSQL,
        ORACLE;
    }

    public static DataBase getDataBase(DataBaseType dataBaseType) {
        switch (dataBaseType) {
            case MYSQL:
                return new Mysql();
            case ORACLE:
                return new Oracle();
            default:
                throw new RuntimeException("unkonw database");
        }
    }


}
