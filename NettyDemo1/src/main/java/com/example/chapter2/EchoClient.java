package com.example.chapter2;

import io.grpc.netty.shaded.io.netty.channel.ChannelFuture;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.net.InetSocketAddress;

public class EchoClient {

    private final String host;
    private final int port;

    public EchoClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public static void main(String[] args) throws Exception {
        if(args.length != 2){
            System.err.println("Usage: "+EchoClient.class.getSimpleName()+"<host><port>");
            return;
        }
        String host = args[0];
        int port = Integer.parseInt(args[1]);
        new EchoClient(host,port).start();
    }
    public void start() throws Exception {
        EventLoopGroup eventLoopGroup = new NioEventLoopGroup();

        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(eventLoopGroup)
                .channel(NioSocketChannel.class)
                .remoteAddress(new InetSocketAddress(host,port))
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel socketChannel) {
                        socketChannel.pipeline().addLast(new EchoClientHandler());
                    }
                });
        ChannelFuture channelFuture = (ChannelFuture) bootstrap.connect().sync();
        channelFuture.channel().closeFuture().sync();
        eventLoopGroup.shutdownGracefully().sync();
    }
}
