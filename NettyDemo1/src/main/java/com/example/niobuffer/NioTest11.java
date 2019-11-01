package com.example.niobuffer;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Arrays;

public class NioTest11 {
    public static void main(String[] args) throws Exception {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        InetSocketAddress inetSocketAddress = new InetSocketAddress(8899);
        serverSocketChannel.socket().bind(inetSocketAddress);

        int messageLength = 2 + 3+4;
        ByteBuffer[] byteBuffer = new ByteBuffer[3];

        byteBuffer[0] = ByteBuffer.allocate(2);
        byteBuffer[1] = ByteBuffer.allocate(3);
        byteBuffer[2] = ByteBuffer.allocate(4);

        SocketChannel socketChannel = serverSocketChannel.accept();

        while (true){
            int bytesRead = 0;

            while (bytesRead < messageLength){
                long r = socketChannel.read(byteBuffer);
                bytesRead = (int) (bytesRead + r);

                System.out.println("bytesRead:"+bytesRead);

                Arrays.asList(byteBuffer).stream().map(byteBuffer1 -> "position:"+byteBuffer1.position() +",limit:" + byteBuffer1.limit())
                        .forEach(System.out::println);
            }

            Arrays.asList(byteBuffer).forEach(byteBuffer1 -> {
                byteBuffer1.flip();
            });

            long bytesWritten = 0;
            while (bytesWritten < messageLength){
                long r = socketChannel.write(byteBuffer);
                bytesWritten = bytesWritten + r;
            }

            Arrays.asList(byteBuffer).forEach(byteBuffer1 -> {
                byteBuffer1.clear();
            });

            System.out.println("bytesRead:"+bytesRead +",bytesWritten:"+bytesWritten+",messageLength:"+messageLength);
        }


    }
}
