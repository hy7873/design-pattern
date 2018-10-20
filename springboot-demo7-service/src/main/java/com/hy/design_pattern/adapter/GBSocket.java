package com.hy.design_pattern.adapter;

/**
 * Created by Administrator on 2018/10/20.
 */
public class GBSocket implements GBSocketInterface{
    @Override
    public void powerWithThreeFlat() {
        System.out.println("使用三项扁插孔供电");
    }
}
