package com.hy.design_pattern.proxy;

/**
 * Created by Administrator on 2018/10/21.
 */
public class SaleProxy implements SaleTowerInterFace{

    private TowerProduce towerProduce;

    public SaleProxy(ConSumer conSumer) {
       towerProduce = new TowerProduce(conSumer);
    }

    @Override
    public void saleTower() {
        towerProduce.saleTower();
    }
}
