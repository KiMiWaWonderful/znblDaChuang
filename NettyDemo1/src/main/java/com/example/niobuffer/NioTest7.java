package com.example.niobuffer;

import java.nio.ByteBuffer;

public class NioTest7 {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);

        for (int i = 0; i < byteBuffer.capacity(); i++) {
            byteBuffer.put((byte) i);
        }

        ByteBuffer readOnlyBuffer = byteBuffer.asReadOnlyBuffer();

        System.out.println(byteBuffer.getClass());
        System.out.println(readOnlyBuffer.getClass());

//        readOnlyBuffer.position(0);
//        readOnlyBuffer.put((byte) 2);
    }
}
