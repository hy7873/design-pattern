package com.hy.design_pattern.factory;

/**
 * Created by Administrator on 2018/10/20.
 */
public class OperationFactory {

    public static Operation createOperation(String operate) throws Exception{
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            default:
                throw new Exception("operate not supported");
        }
        return operation;
    }

}
