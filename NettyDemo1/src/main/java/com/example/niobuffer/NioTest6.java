package com.example.niobuffer;

import java.nio.ByteBuffer;

public class NioTest6 {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);

        for (int i = 0; i < byteBuffer.capacity(); ++i) {
            byteBuffer.put((byte) i);
        }

        byteBuffer.position(2);
        byteBuffer.limit(6);

        ByteBuffer sliceBuffer = byteBuffer.slice();

        for (int i = 0; i < sliceBuffer.capacity(); ++i) {
            byte b = sliceBuffer.get(i);
            b = (byte) (b*2);
            sliceBuffer.put(i,b);
        }

        byteBuffer.position(0);
        byteBuffer.limit(byteBuffer.capacity());

        while (byteBuffer.hasRemaining()){
            System.out.println(byteBuffer.get());
        }
    }
}
