package com.example.nettydemo5;

import com.google.protobuf.InvalidProtocolBufferException;

import java.util.List;

public class ProtoTest {
        public static void main(String[] args) {
            PersonPB.Person.Builder person = PersonPB.Person.newBuilder();
            person.setAge(12);
            person.setId(1);
            person.setName("Jacky");
            person.setExam(0,2.3f);
            person.setExam(1,2.4f);

            //设置map
            person.putMap("a",null);

            PersonPB.Family.Builder fa = PersonPB.Family.newBuilder();
            fa.addP(person);

            System.out.println(person);

            //序列化
            PersonPB.Person pinfo = person.build();
            byte[] barr = pinfo.toByteArray();

            System.out.println(barr.length);

            try {

                //反序列化
                PersonPB.Person p= PersonPB.Person.parseFrom(barr);
                System.out.println(p);

                //获取list
                p.getExamList();

                PersonPB.Family f = PersonPB.Family.parseFrom(fa.build().toByteArray());
                List<PersonPB.Person> list = f.getPList();
                for(PersonPB.Person px : list){
                    System.out.println(px.getAge());
                }
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }
        }
    }


