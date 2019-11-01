package com.example.nettydemo6;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class MySixthServerHandler extends SimpleChannelInboundHandler<DataInfo.MyMessage>{
//    @Override
//    protected void channelRead0(ChannelHandlerContext channelHandlerContext, DataInfo.Student student) throws Exception {
//        System.out.println(student.getName());
//        System.out.println(student.getAddress());
//        System.out.println(student.getAge());
//    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, DataInfo.MyMessage myMessage) throws Exception {

        DataInfo.MyMessage.DataType dataType = myMessage.getDataType();

        if(dataType == DataInfo.MyMessage.DataType.StudentType){
            DataInfo.Student  student = myMessage.getStudent();
            System.out.println(student.getName());
            System.out.println(student.getAddress());
            System.out.println(student.getAge());
        }else if(dataType == DataInfo.MyMessage.DataType.CatType){
            DataInfo.Cat cat = myMessage.getCat();
            System.out.println(cat.getName());
            System.out.println(cat.getCity());
        }else if(dataType == DataInfo.MyMessage.DataType.DogType){
            DataInfo.Dog dog = myMessage.getDog();
            System.out.println(dog.getName());
            System.out.println(dog.getAge());

        }
    }
}
