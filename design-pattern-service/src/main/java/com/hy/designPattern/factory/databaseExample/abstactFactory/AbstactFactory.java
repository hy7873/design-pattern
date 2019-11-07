package com.hy.designPattern.factory.databaseExample.abstactFactory;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * @Author: wanghai
 * @Date:2019/11/7 21:59
 * @Copyright:reach-life
 * @Description:
 */
public abstract class AbstactFactory {

    private IDialect dialect;

    abstract void delete();

    abstract void update();

    abstract void add();

    public void setDialect(String classname) {
        IDialect iDialect = null;
        try {
            iDialect = (IDialect) Class.forName(classname).newInstance();
            setDialect(iDialect);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public IDialect getDialect() {
        return dialect;
    }

    public void setDialect(IDialect iDialect) {
        dialect = iDialect;
    }

}
