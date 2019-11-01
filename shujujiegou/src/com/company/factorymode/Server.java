package com.company.factorymode;

public class Server extends Computer{

    String rpc;
    String hdd;
    public Server(String rpc, String hdd) {
        super(rpc, hdd);
        this.rpc = rpc;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Server{" +
                "rpc='" + rpc + '\'' +
                ", hdd='" + hdd + '\'' +
                '}';
    }
}
