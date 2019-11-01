package com.company.internet;

import java.io.IOException;
import java.net.URL;

public class TestURL {

    public static void main(String[] args) throws IOException {

        URL url = new URL("https://www.bilibili.com/video/av31123719/?p=4#abc");
        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        //System.out.println(url.getContent());
        System.out.println(url.getDefaultPort());
        System.out.println(url.getFile());
        System.out.println(url.getPath());
        System.out.println(url.getQuery());
        System.out.println(url.getRef());
        System.out.println(url.getUserInfo());
        System.out.println(url.getAuthority());

    }
}
