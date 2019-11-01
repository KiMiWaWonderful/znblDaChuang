package com.company.tryreader;

public class ContentEncode {

    public static void main(String[] args) throws Exception{
        String msg = "生命姓名师妹abcd123456";
        byte[] bytes = msg.getBytes();
//        for (int i = 0; i <bytes.length ; i++) {
//            System.out.println(bytes[i]);
//        }
//        System.out.println(bytes.length);
        msg = new String (bytes,0,bytes.length,"gbk");
        System.out.println(msg);
    }
}
