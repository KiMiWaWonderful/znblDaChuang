package com.company.internet;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

//IPaddr
public class TestInetAddress {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia = InetAddress.getLocalHost();
        System.out.println(ia.toString());
        System.out.println(ia.getHostAddress());
        System.out.println(ia.getHostName());
        System.out.println(Arrays.toString(ia.getAddress()));

        System.out.println();

        InetAddress ia2 = InetAddress.getByName("www.baidu.com");
        System.out.println(ia2.toString());
        System.out.println(ia2.getHostAddress());
        System.out.println(ia2.getHostName());
        System.out.println(Arrays.toString(ia2.getAddress()));
    }

}
