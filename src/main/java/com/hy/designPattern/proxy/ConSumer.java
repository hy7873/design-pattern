package com.hy.designPattern.proxy;

/**
 * Created by Administrator on 2018/10/21.
 * 顾客
 */
public class ConSumer {

    private String name;

    public ConSumer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
