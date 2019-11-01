package com.example.nettydemo4;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.timeout.IdleStateHandler;

import java.util.concurrent.TimeUnit;

public class MyFourthServerInitializer extends ChannelInitializer<SocketChannel>{
    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        ChannelPipeline channelPipeline = socketChannel.pipeline();

        channelPipeline.addLast(new IdleStateHandler(5,7,10, TimeUnit.SECONDS));
        channelPipeline.addLast(new MyFourthServerHandler());
    }
}
