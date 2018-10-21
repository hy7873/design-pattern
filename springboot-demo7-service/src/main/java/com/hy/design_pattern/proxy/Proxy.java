package com.hy.design_pattern.proxy;

/**
 * Created by Administrator on 2018/10/21.
 */
public class Proxy implements IGiveGift{

    private Pursuit gg;

    public Proxy(SchoolGirl mm) {
       gg = new Pursuit(mm);
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }
}
