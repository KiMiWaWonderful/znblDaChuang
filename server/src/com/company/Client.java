package com.company;

import java.io.IOException;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        Socket client = new Socket("192.168.0.158",33333);
    }
}
