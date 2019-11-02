package com.hy.designPattern.proxy;

/**
 * @Author: wanghai
 * @Date:2019/9/28 21:53
 * @Copyright:reach-life
 * @Description:
 */
public class PeopleProxy implements IPeople {

    private ZhangsanPeople zhangsanPeople;

    @Override
    public void eat() {
        zhangsanPeople = new ZhangsanPeople();
        System.out.println("drink !");
        zhangsanPeople.eat();
        System.out.println("sleep !");
    }
}
