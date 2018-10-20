package com.hy.design_pattern.factory;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2018/10/20.
 */
public class OperationSub extends Operation {
    @Override
    protected BigDecimal getResult(BigDecimal numberA, BigDecimal numberB) {
        return numberA.subtract(numberB);
    }
}
