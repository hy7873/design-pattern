package com.hy.designPattern.proxy;

/**
 * Created by Administrator on 2018/10/21.
 * 追求者
 */
public class Pursuit implements IGiveGift{

    private SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.getName() + " 送你花花");
    }

    @Override
    public void giveDolls() {
        System.out.println(mm.getName() + " 送你娃娃");
    }
    @Override

    public void giveChocolate() {
        System.out.println(mm.getName() + " 送你巧克力");
    }
}
