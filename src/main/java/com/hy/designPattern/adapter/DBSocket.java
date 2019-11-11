package com.hy.designPattern.adapter;

/**
 * Created by Administrator on 2018/10/20.
 */
public class DBSocket implements DBSocketInterface{
    @Override
    public void powerWithTowRound() {
        System.out.println("使用两个圆头的插孔供电");
    }
}
