package com.hy.designPattern.factory;

/**
 * Created by Administrator on 2018/10/20.
 */
public class AddFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
