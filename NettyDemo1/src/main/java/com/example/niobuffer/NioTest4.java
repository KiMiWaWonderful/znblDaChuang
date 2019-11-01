package com.example.niobuffer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioTest4 {

    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("input");
        FileOutputStream fileOutputStream = new FileOutputStream("output");

        FileChannel inputChannel = fileInputStream.getChannel();
        FileChannel outputChannel = fileOutputStream.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        while (true){
           // byteBuffer.clear();

            int read = inputChannel.read(byteBuffer);

            System.out.println("read:"+read);

            if(read == -1){
                break;
            }

            byteBuffer.flip();

            outputChannel.write(byteBuffer);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
