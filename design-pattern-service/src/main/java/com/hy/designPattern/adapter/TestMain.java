package com.hy.designPattern.adapter;

import org.junit.Test;

/**
 * Created by Administrator on 2018/10/20.
 */
public class TestMain {

    @Test
    public void test1() {
        //初始化一个德标插座对象，用一个德标接口引用
        DBSocketInterface dbSocketInterface = new DBSocket();
        //创建一个旅馆对象
        DBHotel hotel = new DBHotel(dbSocketInterface);
        //在旅馆中给手机充电
        hotel.charge();


        //去德国旅游出差，带的插头是国标的
        GBSocketInterface gbSocketInterface = new GBSocket();
        //来到旅馆
        DBHotel hotel1 = new DBHotel();
        //没办法充电，拿出随身携带的适配器，将我带来的充电器插到适配器的插孔里面，这个上面的插孔是国标
        SocketAdapter socketAdapter = new SocketAdapter(gbSocketInterface);
        //将适配器的下端插入旅馆的插座上
        hotel1.setDbSocket(socketAdapter);
        //可以在旅馆充电了
        hotel1.charge();

    }

}
