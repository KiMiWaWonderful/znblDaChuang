package com.example.nettydemo3;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyChatClient {

    public static void main(String[] args) throws Exception{
        EventLoopGroup eventLoopGroup = new NioEventLoopGroup();

        try {
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(eventLoopGroup)
                    .channel(NioSocketChannel.class)
                    .handler(new MyChatClientInitializer());
//        ChannelFuture channelFuture = bootstrap.connect("localhost",8888).sync();
//        channelFuture.channel().closeFuture().sync();

            Channel channel = bootstrap.connect("localhost",8888).sync().channel();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//        while (true){
//            channel.writeAndFlush(bufferedReader.readLine() +"\r\n");
//        }

            for(;;){
                channel.writeAndFlush(bufferedReader.readLine() +"\r\n");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            eventLoopGroup.shutdownGracefully();
        }


    }
}
