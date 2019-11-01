package com.example.nettydemo3;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

public class MyChatServerHandler extends SimpleChannelInboundHandler<String>{

    private static ChannelGroup channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, String s) throws Exception {
            Channel channel = channelHandlerContext.channel();

            channelGroup.forEach(channel1 ->{
                if(channel != channel1){
                    channel1.writeAndFlush(channel.remoteAddress() +" 发送的消息："+s+"\n");
                }else {
                    channel1.writeAndFlush("自己" + s + "\n");
                }
            });
    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
      //  super.handlerAdded(ctx);
        Channel channel = ctx.channel();
        channelGroup.writeAndFlush("服务器 "+ channel.remoteAddress() +"加入\n");
        channelGroup.add(channel);
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
      //  super.handlerRemoved(ctx);
        Channel channel = ctx.channel();
        channelGroup.writeAndFlush("服务器 "+ channel.remoteAddress() +"离开\n");
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        System.out.println(channel.remoteAddress()+" 上线");
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        System.out.println(channel.remoteAddress()+" 下线");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        //super.exceptionCaught(ctx, cause);
        cause.printStackTrace();
        ctx.close();
    }
}
