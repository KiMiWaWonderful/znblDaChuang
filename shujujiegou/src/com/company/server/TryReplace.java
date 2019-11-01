package com.company.server;

public class TryReplace {

    public static void main(String[] args) {
//        String[] buff = {"TM56"};
//        for (int i = 0; i <buff.length ; i++) {
//            if(buff[i].contains("TM")){
//                buff[i].replace("TM","");
//                //System.out.println("已经替换");
//            }
//        }
//
//        for (int i = 0; i <buff.length ; i++) {
//            System.out.print(buff[i]);
//        }

//        String response = "TM56";
//        String[] buff = response.split(",");
//        for (int i = 0; i <buff.length ; i++) {
//            System.out.print(buff[i]);
//        }
//        for (int i = 0; i <buff.length ; i++) {
//            if(buff[i].contains("TM")){
//                buff[i].replace("TM","");
//            }
//        }
//        for (int i = 0; i <buff.length ; i++) {
//            System.out.print(buff[i]);
//        }
        
      String str = "TM26_HM23_WE24_AR25";
        //System.out.println(str.replace("ID=",""));
      String[] buff = str.split("_");
//        for (int i = 0; i <buff.length ; i++) {
//            System.out.println(buff[i]);
//        }
        for (int i = 0; i <buff.length ; i++) {
            if(buff[i].contains("TM")){
                buff[i]=buff[i].replace("TM","");
            }else if(buff[i].contains("HM")){
                buff[i]= buff[i].replace("HM","");
            }else if(buff[i].contains("WE")){
                buff[i]= buff[i].replace("WE","");
            }else if(buff[i].contains("AR")){
                buff[i]= buff[i].replace("AR","");
            }
        }
        for (int i = 0; i <buff.length ; i++) {
            System.out.println(buff[i]);
        }
        //System.out.println(str.replace("o","T"));
    }
}
