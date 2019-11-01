package com.example.niobuffer;

import java.nio.IntBuffer;
import java.security.SecureRandom;

public class NioTest1 {
    public static void main(String[] args) {
        IntBuffer intBuffer = IntBuffer.allocate(10);

        for (int i = 0; i < intBuffer.capacity() ; ++i) {
            int randomNumber = new SecureRandom().nextInt(20);
            intBuffer.put(randomNumber);
        }

        intBuffer.flip();

        while (intBuffer.hasRemaining()){
            System.out.println(intBuffer.get());
        }
    }

}
