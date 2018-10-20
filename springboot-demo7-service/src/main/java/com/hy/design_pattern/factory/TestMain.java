package com.hy.design_pattern.factory;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2018/10/20.
 */
public class TestMain {

    @Test
    public void test() throws Exception{
        /**
         * 简单工厂方法
         */
        Operation operation = OperationFactory.createOperation("+");
        BigDecimal x = operation.getResult(new BigDecimal("0.1"),new BigDecimal("0.2"));
        System.out.println("x = " + x);

        /**
         * 工厂方法模式
         */
        IFactory factory = new AddFactory();
        Operation operation1 = factory.createOperation();
        BigDecimal y = operation1.getResult(new BigDecimal("0.1"),new BigDecimal("0.2"));
        System.out.println("y = " + y);
    }

}
