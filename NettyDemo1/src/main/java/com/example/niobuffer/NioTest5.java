package com.example.niobuffer;

import java.nio.ByteBuffer;

public class NioTest5 {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(1054);

        byteBuffer.putChar('你');
        byteBuffer.putInt(12);
        byteBuffer.putLong(10L);
        byteBuffer.putDouble(2.34);

        byteBuffer.flip();
//        System.out.println(byteBuffer.getChar());
//        System.out.println(byteBuffer.getDouble());
//        System.out.println(byteBuffer.getLong());
//        System.out.println(byteBuffer.getInt());

        System.out.println(byteBuffer.getChar());
        System.out.println(byteBuffer.getInt());
        System.out.println(byteBuffer.getLong());
        System.out.println(byteBuffer.getDouble());
    }
}
