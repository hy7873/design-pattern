package com.hy.design_pattern.proxy;

/**
 * Created by Administrator on 2018/10/21.
 * 毛巾厂家
 */
public class TowerProduce implements SaleTowerInterFace{

    private ConSumer conSumer;

    public TowerProduce(ConSumer conSumer) {
        this.conSumer = conSumer;
    }

    @Override
    public void saleTower() {
        System.out.println("卖出了毛巾," + conSumer.getName() + "购买了");
    }
}
