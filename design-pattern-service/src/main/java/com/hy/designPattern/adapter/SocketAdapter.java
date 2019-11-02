package com.hy.designPattern.adapter;

/**
 * Created by Administrator on 2018/10/20.
 */
public class SocketAdapter implements DBSocketInterface{//实现旧的接口

    //组合新的接口
    private GBSocketInterface gbSocketInterface;

    /**
     * 一个适配器构造，传入一个新的接口实现类
     * @param gbSocketInterface
     */
    SocketAdapter(GBSocketInterface gbSocketInterface) {
        this.gbSocketInterface = gbSocketInterface;
    }

    /**
     * 将对旧的接口调用适配到新的接口
     */
    @Override
    public void powerWithTowRound() {
        gbSocketInterface.powerWithThreeFlat();
    }
}
