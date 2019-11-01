package com.example.nettydemo6;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.Random;

public class MySixthClientHandler extends SimpleChannelInboundHandler<DataInfo.MyMessage>{
//    @Override

//    protected void channelRead0(ChannelHandlerContext channelHandlerContext, String s) throws Exception {
////        System.out.println(channelHandlerContext.channel().remoteAddress());
////        System.out.println("client output :"+s);
////        channelHandlerContext.writeAndFlush("from client :"+ LocalDateTime.now());
//    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
      //  ctx.writeAndFlush("来自客户端的问候!");

//        DataInfo.Student student = DataInfo.Student.newBuilder()
//                .setName("ss").setAge(10).setAddress("ff").build();
//        ctx.channel().writeAndFlush(student);

        int randomInt = new Random().nextInt(3);
        DataInfo.MyMessage myMessage = null;

        if(randomInt == 0){
            myMessage = DataInfo.MyMessage.newBuilder()
                    .setDataType(DataInfo.MyMessage.DataType.StudentType)
                    .setStudent(DataInfo.Student.newBuilder()
                    .setName("张三").setAge(20)
                    .setAddress("北京").build())
                    .build();
        }else if(randomInt == 1){
            myMessage = DataInfo.MyMessage.newBuilder()
                    .setDataType(DataInfo.MyMessage.DataType.CatType)
                    .setCat(DataInfo.Cat.newBuilder()
                    .setName("猫").setCity("上海")
                    .build())
                    .build();
        }else if (randomInt == 2){
            myMessage = DataInfo.MyMessage.newBuilder()
                    .setDataType(DataInfo.MyMessage.DataType.DogType)
                    .setDog(DataInfo.Dog.newBuilder()
                    .setAge(1).setName("狗")
                    .build())
                    .build();
        }

        ctx.channel().writeAndFlush(myMessage);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }

//    @Override
//    protected void channelRead0(ChannelHandlerContext channelHandlerContext, DataInfo.Student student) throws Exception {
//
//    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, DataInfo.MyMessage myMessage) throws Exception {

    }

//    @Override
//    public void channelActive(ChannelHandlerContext ctx) throws Exception {
//        super.channelActive(ctx);
//    }
}
