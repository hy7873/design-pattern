package com.hy.design_pattern.factory;

/**
 * Created by Administrator on 2018/10/20.
 */
public class SubFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}