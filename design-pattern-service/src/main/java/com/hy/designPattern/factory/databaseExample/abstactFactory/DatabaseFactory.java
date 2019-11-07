package com.hy.designPattern.factory.databaseExample.abstactFactory;

/**
 * @Author: wanghai
 * @Date:2019/11/7 22:08
 * @Copyright:reach-life
 * @Description:
 */
public class DatabaseFactory {

    public static AbstactFactory getAbstactFactory(String classname) {
        AbstactFactory abstactFactory = null;
        try {
            abstactFactory = (AbstactFactory) Class.forName(classname).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return abstactFactory;
    }

}
