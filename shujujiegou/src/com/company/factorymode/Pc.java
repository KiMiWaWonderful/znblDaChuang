package com.company.factorymode;

public class Pc extends Computer{

    String rpc;
    String hdd;
    public Pc(String rpc, String hdd) {
        super(rpc, hdd);
        this.rpc = rpc;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Pc{" +
                "rpc='" + rpc + '\'' +
                ", hdd='" + hdd + '\'' +
                '}';
    }
}
