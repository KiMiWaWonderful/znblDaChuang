package com.znbl.common.controller;

import com.znbl.common.entity.Debate;
import com.znbl.common.entity.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/debate")
public class DebateController {


    @RequestMapping(value="/debateRoundOne")
    @ResponseBody
    public Msg debateRoundOne(@RequestBody Debate debate){

        int num = debate.getNum();
//        switch (num){
//            case 0:
//                List<Integer> infoOne = new ArrayList<Integer>();
//                infoOne.add(JD);
//                infoOne.add(+1);
//                infoOne.add(150);
//                return Msg.success().add("infoOne",infoOne);
//                break;
//            case 1:
//                List<Integer> infoTwo = new ArrayList<Integer>();
//                infoTwo.add(JD);
//                infoTwo.add(-1);
//                infoTwo.add(150);
//                return Msg.success().add("infoTwo",infoTwo);
//            break;
//            default:
//                break;
////            case 2:
////                return Msg.success();
//        }

        if(num == 0){
//            List<Integer> info = new ArrayList<Integer>();
//                info.add(JD);
//                info.add(+1);
//                info.add(150);
            //Debate debate = new Debate();
            //debate.setJD(JD);
            debate.setID(+1);
            debate.setTime(150);
            debate.setNum(0);
            return Msg.success().add("debate",debate);
        }else if(num == 1){
//            List<Integer> info = new ArrayList<Integer>();
//                info.add(JD);
//                info.add(-1);
//                info.add(150);
           // Debate debate = new Debate();
            //debate.setJD(JD);
            debate.setID(-1);
            debate.setTime(150);
            debate.setNum(1);
            return Msg.success().add("debate",debate);
        }
        return Msg.end();
    }


    @RequestMapping("/debateRoundTwo")
    @ResponseBody
    public Msg debateRoundTwo(@RequestBody Debate debate){

        int num = debate.getNum();
//        switch (num){
//            case 0:
//                List<Integer> IDs = new ArrayList<Integer>();
//                IDs.add(-2);
//                IDs.add(-2);
//                Debate debate = new Debate(JD,+2,IDs,0);
//
//        }

        List<Integer> IDs = new ArrayList<Integer>();
        IDs.add(-2);
        IDs.add(-3);

        List<Integer> IDss = new ArrayList<Integer>();
        IDss.add(+2);
        IDss.add(+3);

        while(num == 0){

            //Debate debate = new Debate(JD,+2,IDs,0);
            //model.addAttribute("debate",debate);

            //debate.setID(+2);
            debate.setChoice(+2);
            debate.setIDs(IDs);
            debate.setTime(0);
            debate.setNum(0);
            return Msg.success().add("debate",debate);
        }


        while (num == 1){
            //Debate debate = new Debate();
           // debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(10);
            debate.setNum(1);
            return Msg.success().add("debate",debate);
        }


        while (num == 2){
//            Debate debate = new Debate().add("num",num);
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(20);
            debate.setNum(2);
            return Msg.success().add("debate",debate);
        }


        while (num == 3){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(10);
            debate.setNum(3);
            return Msg.success().add("debate",debate);
        }


        while (num == 4){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(20);
            debate.setNum(4);
            return Msg.success().add("debate",debate);
        }


        while (num == 5){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(10);
            debate.setNum(5);
            return Msg.success().add("debate",debate);
        }


        while (num == 6){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(20);
            debate.setNum(6);
            return Msg.success().add("debate",debate);
        }

        while(num == 7){

            //Debate debate = new Debate(JD,+3,IDs,0);
           // debate.setID(+3);
            debate.setChoice(+3);
            debate.setIDs(IDs);
            debate.setTime(0);
            debate.setNum(7);
            //model.addAttribute("debate",debate);
            return Msg.success().add("debate",debate);
        }


        while (num == 8){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(10);
            debate.setNum(8);
            return Msg.success().add("debate",debate);
        }


        while (num == 9){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(20);
            debate.setNum(9);
            return Msg.success().add("debate",debate);
        }


        while (num == 10){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(10);
            debate.setNum(10);
            return Msg.success().add("debate",debate);
        }


        while (num == 11){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(20);
            debate.setNum(11);
            return Msg.success().add("debate",debate);
        }


        while (num == 12){
            //Debate debate = new Debate();
            //debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(10);
            debate.setNum(12);
            return Msg.success().add("debate",debate);
        }


        while (num == 13){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(20);
            debate.setNum(13);
            return Msg.success().add("debate",debate);
        }

        while(num == 14){

           // Debate debate = new Debate(JD,+3,IDss,0);
            debate.setNum(14);
            debate.setTime(0);
           // debate.setID(3);
            debate.setChoice(-2);
            debate.setIDs(IDss);
            //model.addAttribute("debate",debate);
            return Msg.success().add("debate",debate);
        }


        while (num == 15){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(10);
            debate.setNum(15);
            return Msg.success().add("debate",debate);
        }


        while (num == 16){
//            Debate debate = new Debate();
////            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(20);
            debate.setNum(16);
            return Msg.success().add("debate",debate);
        }


        while (num == 17){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(10);
            debate.setNum(17);
            return Msg.success().add("debate",debate);
        }


        while (num == 18){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(20);
            debate.setNum(18);
            return Msg.success().add("debate",debate);
        }


        while (num == 19){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(10);
            debate.setNum(19);
            return Msg.success().add("debate",debate);
        }


        while (num == 20){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(20);
            debate.setNum(20);
            return Msg.success().add("debate",debate);
        }

        while(num == 21){

            //Debate debate = new Debate(JD,+3,IDss,0);
            //model.addAttribute("debate",debate);
            debate.setChoice(-3);
            debate.setIDs(IDss);
            debate.setTime(0);
            debate.setNum(21);
            return Msg.success().add("debate",debate);
        }


        while (num == 22){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(10);
            debate.setNum(22);
            return Msg.success().add("debate",debate);
        }


        while (num == 23){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(20);
            debate.setNum(23);
            return Msg.success().add("debate",debate);
        }


        while (num == 24){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(10);
            debate.setNum(24);
            return Msg.success().add("debate",debate);
        }


        while (num == 25){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(20);
            debate.setNum(25);
            return Msg.success().add("debate",debate);
        }


        while (num == 26){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(10);
            debate.setNum(26);
            return Msg.success().add("debate",debate);
        }


        while (num == 27){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(20);
            debate.setNum(27);
            return Msg.success().add("debate",debate);
        }

        return  Msg.end();

    }


    @RequestMapping("/debateRoundThere")
    @ResponseBody
    public Msg debateRoundThere(@RequestBody Debate debate){

        int round = debate.getRound();
        int num = debate.getNum();

        if(num == 0){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(+1);
            debate.setTime(90);
            debate.setNum(0);
            return Msg.success().add("debate",debate);
        }else if(num == 1){
//            List<Integer> info = new ArrayList<Integer>();
//            info.add(JD);
//            info.add(-1);
//            info.add(90);
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(-1);
            debate.setTime(90);
            debate.setNum(1);
            return Msg.success().add("debate",debate);
        }
        return Msg.end();
    }


    @RequestMapping("/debateRoundFour")
    @ResponseBody
    public Msg debateRoundFour(@RequestBody Debate debate){


        int round = debate.getRound();
        int PosReTime = debate.getPosReTime();
        int NegReTime = debate.getNegReTime();
        int ID = debate.getID();
        int judgement = debate.getJudgement();

        if(judgement == 1 && ID<0 && PosReTime != 0){
            debate.setSignal(1);
            debate.setID(1);
            return Msg.success().add("debate",debate);
        }else if(judgement == 1 && ID>0 && NegReTime != 0){
            debate.setSignal(1);
            debate.setID(1);
            return Msg.success().add("debate",debate);
        }else if(PosReTime == 0 && NegReTime == 0){
            debate.setPosReTime(0);
            debate.setNegReTime(0);
            return Msg.success().add("debate",debate);
        }else if(judgement == 0){
            debate.setSignal(0);
            return Msg.success().add("debate",debate);
        }

        return Msg.end();

    }


    @RequestMapping("/debateRoundFive")
    @ResponseBody
    public Msg debateRoundFive(@RequestBody Debate debate){

        int num = debate.getNum();

        if(num == 0){
//            List<Integer> info = new ArrayList<Integer>();
//            info.add(JD);
//            info.add(+4);
//            info.add(240);
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(+4);
            debate.setTime(240);
            debate.setNum(0);
            return Msg.success().add("debate",debate);
        }else if(num == 1){
//            List<Integer> info = new ArrayList<Integer>();
//            info.add(JD);
//            info.add(-4);
//            info.add(240);
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(-4);
            debate.setTime(240);
            debate.setNum(1);
            return Msg.success().add("debate",debate);
        }
        return Msg.end();
    }


}
