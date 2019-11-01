package com.znbl.common.entity;

import java.io.Serializable;

public class SeeUser implements Serializable{
    private String id;
    private String ip;//用户的id
    private String seeTime;//用户访问的时间
    private int seeCount;//用户访问的次数

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getSeeTime() {
        return seeTime;
    }

    public void setSeeTime(String seeTime) {
        this.seeTime = seeTime;
    }

    public int getSeeCount() {
        return seeCount;
    }

    public void setSeeCount(int seeCount) {
        this.seeCount = seeCount;
    }
}
