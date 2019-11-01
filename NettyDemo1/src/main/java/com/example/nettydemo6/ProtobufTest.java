package com.example.nettydemo6;

public class ProtobufTest {

    public static void main(String[] args) throws Exception{
        DataInfo.Student student = DataInfo.Student.newBuilder().
                setName("ff").setAge(12).setAddress("一二三").build();

        byte[] bytes = student.toByteArray();

        DataInfo.Student student1 = DataInfo.Student.parseFrom(bytes);

        System.out.println(student1.getAddress());

    }
}
