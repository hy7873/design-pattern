package com.hy.designPattern.factory;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2018/10/20.
 */
public abstract class Operation {

    protected abstract BigDecimal getResult(BigDecimal numberA,BigDecimal numberB);

}
