package com.example.chapter2;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.net.InetSocketAddress;

public class EchoServer {

    private final int port;
    EchoServerHandler echoServerHandler = new EchoServerHandler();


    public EchoServer(int port) {
        this.port = port;
    }

    public static void main(String[] args) throws Exception {
        if(args.length != 1){
            System.err.println("Usage: "+EchoServer.class.getSimpleName()+"<port>");
            return;
        }

        int port = Integer.parseInt(args[0]);
        new EchoServer(port).start();
    }

    public  void start() throws Exception {
        final EchoServerHandler echoServerHandler = new EchoServerHandler();
        EventLoopGroup eventLoopGroup = new NioEventLoopGroup();

        ServerBootstrap serverBootstrap = new ServerBootstrap();
        serverBootstrap.group(eventLoopGroup)
                .channel(NioServerSocketChannel.class)
                .localAddress(new InetSocketAddress(port))
                .childHandler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel socketChannel) {
                        socketChannel.pipeline().addLast(new EchoServerHandler());
                    }
                });
        ChannelFuture channelFuture = serverBootstrap.bind().sync();
        channelFuture.channel().closeFuture().sync();
        eventLoopGroup.shutdownGracefully().sync();

    }
}
