package com.company.factorymode;

public abstract class Computer {
    String rpc;
    String hdd;

    public Computer(String rpc, String hdd) {
        this.rpc = rpc;
        this.hdd = hdd;
    }

    public String getRpc() {
        return rpc;
    }

    public void setRpc(String rpc) {
        this.rpc = rpc;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }
}
