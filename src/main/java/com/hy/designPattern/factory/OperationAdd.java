package com.hy.designPattern.factory;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2018/10/20.
 */
public class OperationAdd extends Operation{

    @Override
    protected BigDecimal getResult(BigDecimal numberA, BigDecimal numberB) {
        return numberA.add(numberB);
    }
}
