package com.company.factorymode;

public class ComputerFactory {

    public  Computer getComputer(String type){
        if(type == "Pc"){
            //System.out.println("this is pc");
            return new Pc("rpc pc","hdd pc");
        }else if(type == "Server"){
           // System.out.println("this is server");
            return new Server("rpc server","hdd server");
        }else {
            return null;
        }
    }
}
