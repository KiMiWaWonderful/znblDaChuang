package com.example.chapter4;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.channel.oio.OioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.oio.OioServerSocketChannel;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;

public class NettyOioServer {

    public void server(int port) throws Exception {
        final ByteBuf byteBuffer = Unpooled.unreleasableBuffer(Unpooled.copiedBuffer("Hi\r\n", Charset.forName("UTF-8")));
        EventLoopGroup eventLoopGroup = new OioEventLoopGroup();

        ServerBootstrap serverBootstrap = new ServerBootstrap();

        serverBootstrap.group(eventLoopGroup)
                .channel(OioServerSocketChannel.class)
                .localAddress(new InetSocketAddress(port))
                .childHandler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel socketChannel) {
                        socketChannel.pipeline().addLast(
                                new ChannelInboundHandlerAdapter(){
                                    @Override
                                    public void channelActive(ChannelHandlerContext ctx) throws Exception {
                                        ctx.writeAndFlush(byteBuffer.duplicate()).addListener(ChannelFutureListener.CLOSE);
                                    }
                                }
                        );
                    }
                });

        ChannelFuture channelFuture = serverBootstrap.bind().sync();
        channelFuture.channel().closeFuture().sync();
        eventLoopGroup.shutdownGracefully().sync();
    }
}
