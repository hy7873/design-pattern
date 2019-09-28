package com.hy.design_pattern.adapter;

/**
 * Created by Administrator on 2018/10/20.
 */
public class Hotel {

    private DBSocketInterface dbSocket;

    public Hotel() {

    }

    public Hotel(DBSocketInterface dbSocket) {
        this.dbSocket = dbSocket;
    }

    void setDbSocket(DBSocketInterface dbSocket) {
        this.dbSocket = dbSocket;
    }

    public void charge() {
        dbSocket.powerWithTowRound();
    }

}
