package com.hy.designPattern.adapter;

/**
 * Created by Administrator on 2018/10/20.
 */
public class DBHotel {

    private DBSocketInterface dbSocket;

    public DBHotel() {

    }

    public DBHotel(DBSocketInterface dbSocket) {
        this.dbSocket = dbSocket;
    }

    void setDbSocket(DBSocketInterface dbSocket) {
        this.dbSocket = dbSocket;
    }

    public void charge() {
        dbSocket.powerWithTowRound();
    }

}
