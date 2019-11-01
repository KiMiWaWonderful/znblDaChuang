package com.example.nettydemo;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpServerCodec;

//import java.nio.channels.SocketChannel;

public class TestServerChannelInitializer extends ChannelInitializer<SocketChannel> {
//    @Override
//    protected void channelRead0(ChannelHandlerContext channelHandlerContext, HttpObject httpObject) throws Exception {
//      //  ChannelPipeline channelPipeline
//    }


    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        ChannelPipeline channelPipeline = socketChannel.pipeline();
        channelPipeline.addLast("httpServerCodec",new HttpServerCodec());
        channelPipeline.addLast("serverHandler",new TestServerHandler());
    }
}
