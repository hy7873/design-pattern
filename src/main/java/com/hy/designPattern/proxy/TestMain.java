package com.hy.designPattern.proxy;

import org.junit.Test;

/**
 * Created by Administrator on 2018/10/21.
 */
public class TestMain {

    @Test
    public void test1() {
        //泡妹子
        SchoolGirl jiaojiao = new SchoolGirl("娇娇");
        Proxy proxy = new Proxy(jiaojiao);
        proxy.giveChocolate();
        proxy.giveDolls();
        proxy.giveFlowers();

        //卖毛巾
        ConSumer conSumer = new ConSumer("zhanghua");
        SaleProxy saleProxy = new SaleProxy(conSumer);
        saleProxy.saleTower();
    }
}
