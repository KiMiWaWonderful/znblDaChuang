package com.znbl.utils;

import com.znbl.pojo.Debate;

import java.util.ArrayList;
import java.util.List;

public class DebateUtils {

    public static String debateRoundOne( String msg){

        Debate debate = JsonUtils.jsonToPojo(msg,Debate.class);
        int num = debate.getNum();


        if(num == 0){

            System.out.println("进入DEBATE第一阶段！此时num为0！");
            debate.setID(+1);
            debate.setTime(150);
            debate.setNum(0);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"ID\":\"").append(+1);
//            //stringBuilder.append("\"IDs\":\"").append(IDs);
//            stringBuilder.append("\"time\":\"").append(150);
//            stringBuilder.append("\"num\":\"").append(0);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
//            System.out.println("Debate.id="+debate.getID());
//            System.out.println("Debate.time="+debate.getTime());
//            System.out.println("Debate.num="+debate.getNum());

            String message = JsonUtils.objectToJson(debate);
           return message;
            // return Msg.success().add("debate",debate);
        }else if(num == 1){
            System.out.println("进入DEBATE第一阶段！此时num为1！");
            debate.setID(-1);
            debate.setTime(150);
            debate.setNum(1);

           String message = JsonUtils.objectToJson(debate);
            //System.out.println("message="+message);
            return message;
            //return Msg.success().add("debate",debate);
        }
//        else {
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"Error\":\"").append("所有条件均不符合！");
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
//          //  return message;
//            //System.out.println("没有合适的选项！");
//        }
        return null;
    }

    public static String debateRoundTwo(String msg){

        Debate debate = JsonUtils.jsonToPojo(msg,Debate.class);
        int num = debate.getNum();


        while(num == 0){
            List<Integer> IDs = new ArrayList<Integer>();
            IDs.add(-2);
            IDs.add(-3);

            //Debate debate = new Debate(JD,+2,IDs,0);
            //model.addAttribute("debate",debate);

            //debate.setID(+2);
            debate.setChoice(+2);
            debate.setIDs(IDs);
            debate.setTime(0);
            debate.setNum(0);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"choice\":\"").append(+2);
//            stringBuilder.append("\"IDs\":\"").append(IDs);
//            stringBuilder.append("\"time\":\"").append(90);
//            stringBuilder.append("\"num\":\"").append(0);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
           String message = JsonUtils.objectToJson(debate);
//            System.out.println("message="+message);
            return message;
            //return Msg.success().add("debate",debate);
        }

        //提问

        while (num == 1){

            //Debate debate = new Debate();
            // debate.setJD(JD);
           // debate.setID(debate.getChoice());
            debate.setID(+2);
            debate.setTime(10);
            debate.setNum(1);
            //debate.setIDs(IDs);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"ID\":\"").append(debate.getChoice());
//            //stringBuilder.append("\"IDs\":\"").append(IDs);
//            stringBuilder.append("\"time\":\"").append(10);
//            stringBuilder.append("\"num\":\"").append(1);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
            String message = JsonUtils.objectToJson(debate);
////            System.out.println("message="+message);
           return message;
            //return Msg.success().add("debate",debate);
        }


        //回答
        while (num == 2){
//            Debate debate = new Debate().add("num",num);
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            //debate.setID(+2);
            debate.setTime(20);
            debate.setNum(2);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"ID\":\"").append(debate.getChoice());
//            //stringBuilder.append("\"IDs\":\"").append(IDs);
//            stringBuilder.append("\"time\":\"").append(20);
//            stringBuilder.append("\"num\":\"").append(2);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
           String message = JsonUtils.objectToJson(debate);
            return message;
            //return Msg.success().add("debate",debate);
        }


        //提问
        while (num == 3){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            //debate.setID(debate.getChoice());
            debate.setID(+2);
            debate.setTime(10);
            debate.setNum(3);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"ID\":\"").append(debate.getChoice());
//            //stringBuilder.append("\"IDs\":\"").append(IDs);
//            stringBuilder.append("\"time\":\"").append(10);
//            stringBuilder.append("\"num\":\"").append(3);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
           String message = JsonUtils.objectToJson(debate);
            return message;
            // return Msg.success().add("debate",debate);
        }


        //回答
        while (num == 4){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(20);
            debate.setNum(4);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"ID\":\"").append(debate.getChoice());
//            //stringBuilder.append("\"IDs\":\"").append(IDs);
//            stringBuilder.append("\"time\":\"").append(20);
//            stringBuilder.append("\"num\":\"").append(4);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
            String message = JsonUtils.objectToJson(debate);
            return message;
            // return Msg.success().add("debate",debate);
        }


        //提问
        while (num == 5){
//            Debate debate = new Debate();
//            debate.setJD(JD);
           // debate.setID(debate.getChoice());
            debate.setID(+2);
            debate.setTime(10);
            debate.setNum(5);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"ID\":\"").append(debate.getChoice());
//            //stringBuilder.append("\"IDs\":\"").append(IDs);
//            stringBuilder.append("\"time\":\"").append(10);
//            stringBuilder.append("\"num\":\"").append(5);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
             String message = JsonUtils.objectToJson(debate);
            return message;
            //return Msg.success().add("debate",debate);
        }


        //回答
        while (num == 6){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(20);
            debate.setNum(6);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"ID\":\"").append(debate.getChoice());
//            //stringBuilder.append("\"IDs\":\"").append(IDs);
//            stringBuilder.append("\"time\":\"").append(20);
//            stringBuilder.append("\"num\":\"").append(6);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
            String message = JsonUtils.objectToJson(debate);
            return message;
            //return Msg.success().add("debate",debate);
        }

        //提问
        while(num == 7){
            List<Integer> IDs = new ArrayList<Integer>();
            IDs.add(-2);
            IDs.add(-3);

            //Debate debate = new Debate(JD,+3,IDs,0);
            // debate.setID(+3);
            debate.setChoice(+3);
            debate.setIDs(IDs);
            debate.setTime(0);
            debate.setNum(7);
            //model.addAttribute("debate",debate);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"choice\":\"").append(+3);
//            stringBuilder.append("\"IDs\":\"").append(IDs);
//            stringBuilder.append("\"time\":\"").append(10);
//            stringBuilder.append("\"num\":\"").append(1);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
           String message = JsonUtils.objectToJson(debate);
////            System.out.println("message="+message);
           return message;
            //return Msg.success().add("debate",debate);
        }


        while (num == 8){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            //debate.setID(debate.getChoice());
            debate.setID(+3);
            debate.setTime(10);
            debate.setNum(8);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"ID\":\"").append(debate.getChoice());
//            //stringBuilder.append("\"IDs\":\"").append(IDs);
//            stringBuilder.append("\"time\":\"").append(10);
//            stringBuilder.append("\"num\":\"").append(8);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
            String message = JsonUtils.objectToJson(debate);
            return message;
            //return Msg.success().add("debate",debate);
        }


        while (num == 9){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(20);
            debate.setNum(9);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"ID\":\"").append(debate.getChoice());
//            //stringBuilder.append("\"IDs\":\"").append(IDs);
//            stringBuilder.append("\"time\":\"").append(20);
//            stringBuilder.append("\"num\":\"").append(9);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
            String message = JsonUtils.objectToJson(debate);
            return message;
            // return Msg.success().add("debate",debate);
        }


        while (num == 10){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            //debate.setID(debate.getChoice());
            debate.setID(+3);
            debate.setTime(10);
            debate.setNum(10);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"ID\":\"").append(debate.getChoice());
//            //stringBuilder.append("\"IDs\":\"").append(IDs);
//            stringBuilder.append("\"time\":\"").append(10);
//            stringBuilder.append("\"num\":\"").append(10);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
           String message = JsonUtils.objectToJson(debate);
           return message;
            //return Msg.success().add("debate",debate);
        }


        while (num == 11){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(20);
            debate.setNum(11);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"ID\":\"").append(debate.getChoice());
//            //stringBuilder.append("\"IDs\":\"").append(IDs);
//            stringBuilder.append("\"time\":\"").append(20);
//            stringBuilder.append("\"num\":\"").append(11);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
           String message = JsonUtils.objectToJson(debate);
           return message;
            //return Msg.success().add("debate",debate);
        }


        while (num == 12){
            //Debate debate = new Debate();
            //debate.setJD(JD);
            //debate.setID(debate.getChoice());
            debate.setID(+3);
            debate.setTime(10);
            debate.setNum(12);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"ID\":\"").append(debate.getChoice());
//            //stringBuilder.append("\"IDs\":\"").append(IDs);
//            stringBuilder.append("\"time\":\"").append(10);
//            stringBuilder.append("\"num\":\"").append(12);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
           String message = JsonUtils.objectToJson(debate);
           return message;
            // return Msg.success().add("debate",debate);
        }


        while (num == 13){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(20);
            debate.setNum(13);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"ID\":\"").append(debate.getChoice());
//            //stringBuilder.append("\"IDs\":\"").append(IDs);
//            stringBuilder.append("\"time\":\"").append(20);
//            stringBuilder.append("\"num\":\"").append(13);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
            String message = JsonUtils.objectToJson(debate);
           return message;
            //return Msg.success().add("debate",debate);
        }

        while(num == 14){
            List<Integer> IDs = new ArrayList<Integer>();
            IDs.add(+2);
            IDs.add(+3);

            // Debate debate = new Debate(JD,+3,IDss,0);
            debate.setNum(14);
            debate.setTime(0);
            // debate.setID(3);
            debate.setChoice(-2);
            debate.setIDs(IDs);
            //model.addAttribute("debate",debate);

//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"choice\":\"").append(-2);
//            stringBuilder.append("\"IDs\":\"").append(IDs);
//            stringBuilder.append("\"time\":\"").append(0);
//            stringBuilder.append("\"num\":\"").append(14);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
           String message = JsonUtils.objectToJson(debate);
           return message;
            // return Msg.success().add("debate",debate);
        }


        while (num == 15){
//            Debate debate = new Debate();
//            debate.setJD(JD);
           // debate.setID(debate.getChoice());
            debate.setID(-2);
            debate.setTime(10);
            debate.setNum(15);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"ID\":\"").append(debate.getChoice());
//            //stringBuilder.append("\"IDs\":\"").append(IDs);
//            stringBuilder.append("\"time\":\"").append(10);
//            stringBuilder.append("\"num\":\"").append(15);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
            String message = JsonUtils.objectToJson(debate);
            return message;
            // return Msg.success().add("debate",debate);
        }


        while (num == 16){
//            Debate debate = new Debate();
////            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(20);
            debate.setNum(16);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"ID\":\"").append(debate.getChoice());
//            //stringBuilder.append("\"IDs\":\"").append(IDs);
//            stringBuilder.append("\"time\":\"").append(20);
//            stringBuilder.append("\"num\":\"").append(16);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
            String message = JsonUtils.objectToJson(debate);
           return message;
            //return Msg.success().add("debate",debate);
        }


        while (num == 17){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            //debate.setID(debate.getChoice());
            debate.setID(-2);
            debate.setTime(10);
            debate.setNum(17);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"ID\":\"").append(debate.getChoice());
//            //stringBuilder.append("\"IDs\":\"").append(IDs);
//            stringBuilder.append("\"time\":\"").append(10);
//            stringBuilder.append("\"num\":\"").append(17);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
           String message = JsonUtils.objectToJson(debate);
           return message;
            // return Msg.success().add("debate",debate);
        }


        while (num == 18){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(20);
            debate.setNum(18);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"ID\":\"").append(debate.getChoice());
//            //stringBuilder.append("\"IDs\":\"").append(IDs);
//            stringBuilder.append("\"time\":\"").append(20);
//            stringBuilder.append("\"num\":\"").append(18);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
           String message = JsonUtils.objectToJson(debate);
            return message;
            //return Msg.success().add("debate",debate);
        }


        while (num == 19){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            //debate.setID(debate.getChoice());
            debate.setID(-2);
            debate.setTime(10);
            debate.setNum(19);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"ID\":\"").append(debate.getChoice());
//            //stringBuilder.append("\"IDs\":\"").append(IDs);
//            stringBuilder.append("\"time\":\"").append(10);
//            stringBuilder.append("\"num\":\"").append(19);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
            String message = JsonUtils.objectToJson(debate);
            return message;
            // return Msg.success().add("debate",debate);
        }


        while (num == 20){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(20);
            debate.setNum(20);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"ID\":\"").append(debate.getChoice());
//            //stringBuilder.append("\"IDs\":\"").append(IDs);
//            stringBuilder.append("\"time\":\"").append(20);
//            stringBuilder.append("\"num\":\"").append(20);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
           String message = JsonUtils.objectToJson(debate);
           return message;
            //return Msg.success().add("debate",debate);
        }

        while(num == 21){
            List<Integer> IDs = new ArrayList<Integer>();
            IDs.add(+2);
            IDs.add(+3);

            //Debate debate = new Debate(JD,+3,IDss,0);
            //model.addAttribute("debate",debate);
            debate.setChoice(-3);
            debate.setIDs(IDs);
            debate.setTime(0);
            debate.setNum(21);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"choice\":\"").append(-3);
//            stringBuilder.append("\"IDs\":\"").append(IDs);
//            stringBuilder.append("\"time\":\"").append(0);
//            stringBuilder.append("\"num\":\"").append(21);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
           String message = JsonUtils.objectToJson(debate);
           return message;
            //return Msg.success().add("debate",debate);
        }


        while (num == 22){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            //debate.setID(debate.getChoice());
            debate.setID(-3);
            debate.setTime(10);
            debate.setNum(22);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"ID\":\"").append(debate.getChoice());
//            //stringBuilder.append("\"IDs\":\"").append(IDs);
//            stringBuilder.append("\"time\":\"").append(10);
//            stringBuilder.append("\"num\":\"").append(22);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
           String message = JsonUtils.objectToJson(debate);
            return message;
            //return Msg.success().add("debate",debate);
        }


        while (num == 23){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(20);
            debate.setNum(23);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"ID\":\"").append(debate.getChoice());
//            //stringBuilder.append("\"IDs\":\"").append(IDs);
//            stringBuilder.append("\"time\":\"").append(20);
//            stringBuilder.append("\"num\":\"").append(23);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
           String message = JsonUtils.objectToJson(debate);
           return message;
            //return Msg.success().add("debate",debate);
        }


        while (num == 24){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            //debate.setID(debate.getChoice());
            debate.setID(-3);
            debate.setTime(10);
            debate.setNum(24);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"ID\":\"").append(debate.getChoice());
//            //stringBuilder.append("\"IDs\":\"").append(IDs);
//            stringBuilder.append("\"time\":\"").append(10);
//            stringBuilder.append("\"num\":\"").append(24);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
            String message = JsonUtils.objectToJson(debate);
            return message;
            //   return Msg.success().add("debate",debate);
        }


        while (num == 25){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(20);
            debate.setNum(25);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"ID\":\"").append(debate.getChoice());
//            //stringBuilder.append("\"IDs\":\"").append(IDs);
//            stringBuilder.append("\"time\":\"").append(20);
//            stringBuilder.append("\"num\":\"").append(25);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
            String message = JsonUtils.objectToJson(debate);
            return message;
            // return Msg.success().add("debate",debate);
        }


        while (num == 26){
//            Debate debate = new Debate();
//            debate.setJD(JD);
           // debate.setID(debate.getChoice());
            debate.setID(-3);
            debate.setTime(10);
            debate.setNum(26);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"ID\":\"").append(debate.getChoice());
//            //stringBuilder.append("\"IDs\":\"").append(IDs);
//            stringBuilder.append("\"time\":\"").append(10);
//            stringBuilder.append("\"num\":\"").append(26);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
            String message = JsonUtils.objectToJson(debate);
            return message;
            // return Msg.success().add("debate",debate);
        }


        while (num == 27){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(20);
            debate.setNum(27);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"ID\":\"").append(debate.getChoice());
//            //stringBuilder.append("\"IDs\":\"").append(IDs);
//            stringBuilder.append("\"time\":\"").append(20);
//            stringBuilder.append("\"num\":\"").append(27);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
            String message = JsonUtils.objectToJson(debate);
            return message;
            //return Msg.success().add("debate",debate);
        }

        return  null;

    }

    public static String debateRoundThere(String msg){

        Debate debate = JsonUtils.jsonToPojo(msg,Debate.class);
        int round = debate.getRound();
        int num = debate.getNum();

        if(num == 0){
            System.out.println("进入DEBATE第三阶段！此时num为0！");
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(+1);
            debate.setTime(90);
            debate.setNum(0);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"ID\":\"").append(+1);
//            stringBuilder.append("\"Time\":\"").append(90);
//            stringBuilder.append("\"num\":\"").append(0);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
            String message = JsonUtils.objectToJson(debate);
////            System.out.println(message);
           return message;
            //return Msg.success().add("debate",debate);
        }else if(num == 1){
            System.out.println("进入DEBATE第三阶段！此时num为1！");
            debate.setID(-1);
            debate.setTime(90);
            debate.setNum(1);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"ID\":\"").append(-1);
//            stringBuilder.append("\"Time\":\"").append(90);
//            stringBuilder.append("\"num\":\"").append(1);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
//
            String message = JsonUtils.objectToJson(debate);
            return message;
            //return Msg.success().add("debate",debate);
        }
//        else {
//            System.out.println("没有合适的选项！");
//
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"Error\":\"").append("所有条件均不符合！");
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
//            System.out.println("message="+message);
//            return message;
//        }
        return null;
    }

    public static String debateRoundFour(String msg){

        Debate debate = JsonUtils.jsonToPojo(msg,Debate.class);
        int round = debate.getRound();
        int PosReTime = debate.getPosReTime();
        int NegReTime = debate.getNegReTime();
        int ID = debate.getID();
        int judgement = debate.getJudgement();

        System.out.println("Debate.round="+round);
        System.out.println("Debate.PosReTime="+PosReTime);
        System.out.println("Debate.NegReTime="+NegReTime);
        System.out.println("Debate.ID="+ID);
        System.out.println("Debate.judgement="+judgement);

        if(judgement == 1 && ID<0 && PosReTime != 0){
            debate.setSignal(1);
            debate.setID(1);
            debate.setPosReTime(PosReTime);
            debate.setNegReTime(NegReTime);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"Signal\":\"").append(1);
//            stringBuilder.append("\"ID\":\"").append(1);
//            stringBuilder.append("\"PosReTime\":\"").append(PosReTime);
//            stringBuilder.append("\"NegReTime\":\"").append(NegReTime);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
            String message = JsonUtils.objectToJson(debate);
////            System.out.println("message="+message);
           return message;
            //return Msg.success().add("debate",debate);
        }else if(judgement == 1 && ID>0 && NegReTime != 0){
            debate.setSignal(1);
            debate.setID(1);
            debate.setPosReTime(PosReTime);
            debate.setNegReTime(NegReTime);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"Signal\":\"").append(1);
//            stringBuilder.append("\"ID\":\"").append(1);
//            stringBuilder.append("\"PosReTime\":\"").append(PosReTime);
//            stringBuilder.append("\"NegReTime\":\"").append(NegReTime);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
            String message = JsonUtils.objectToJson(debate);
////            System.out.println("message="+message);
           return message;
            // return Msg.success().add("debate",debate);
        }else if(PosReTime == 0 && NegReTime == 0){
            debate.setPosReTime(0);
            debate.setNegReTime(0);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"PosReTime\":\"").append(0);
//            stringBuilder.append("\"NegReTime\":\"").append(0);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
            String message = JsonUtils.objectToJson(debate);
////            System.out.println("message="+message);
            return message;
            //return Msg.success().add("debate",debate);
        }else if(judgement == 0){
            debate.setSignal(0);
            debate.setPosReTime(PosReTime);
            debate.setNegReTime(NegReTime);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"Signal\":\"").append(0);
//            //stringBuilder.append("\"ID\":\"").append(1);
//            stringBuilder.append("\"PosReTime\":\"").append(PosReTime);
//            stringBuilder.append("\"NegReTime\":\"").append(NegReTime);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
            String message = JsonUtils.objectToJson(debate);
////            System.out.println("message="+message);
           return message;
            //return Msg.success().add("debate",debate);
        }
//        else{
//            System.out.println("没有合适的选项！");
//
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"Error\":\"").append("所有条件均不符合！");
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
//            System.out.println("message="+message);
//            return message;
//        }

        return null;

    }

    public static String debateRoundFive(String msg){

        Debate debate = JsonUtils.jsonToPojo(msg,Debate.class);
        int num = debate.getNum();

        if(num == 0){
            System.out.println("进入DEBATE第五阶段！此时num为0！");
            debate.setID(+4);
            debate.setTime(240);
            debate.setNum(0);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"ID\":\"").append(4);
//            stringBuilder.append("\"Time\":\"").append(240);
//            stringBuilder.append("\"num\":\"").append(0);
//            stringBuilder.append("\"}");
           String message = JsonUtils.objectToJson(debate);
////            System.out.println("message="+message);
//            String message = stringBuilder.toString();
           return message;
            // return Msg.success().add("debate",debate);
        }else if(num == 1){
            System.out.println("进入DEBATE第五阶段！此时num为1！");
            debate.setID(-4);
            debate.setTime(240);
            debate.setNum(1);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("{");
//            stringBuilder.append("\"ID\":\"").append(-4);
//            stringBuilder.append("\"Time\":\"").append(240);
//            stringBuilder.append("\"num\":\"").append(1);
//            stringBuilder.append("\"}");
//            String message = stringBuilder.toString();
            String message = JsonUtils.objectToJson(debate);
////            System.out.println("message="+message);
           return message;
            //return Msg.success().add("debate",debate);
        }
//        else {
////            System.out.println("没有合适的选项！");
////
////            StringBuilder stringBuilder = new StringBuilder();
////            stringBuilder.append("{");
////            stringBuilder.append("\"Error\":\"").append("所有条件均不符合！");
////            stringBuilder.append("\"}");
////            String message = stringBuilder.toString();
////            System.out.println("message="+message);
////            return message;
////        }
        return null;
    }

}
