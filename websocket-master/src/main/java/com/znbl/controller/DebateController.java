package com.znbl.controller;

import com.znbl.pojo.Debate;
//import com.znbl.pojo.Msg;
import com.znbl.pojo.ZnblResult;
import com.znbl.service.DebateService;
import com.znbl.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


/**
 * 辩论模块
 */
@Controller
@RequestMapping("/debate")
public class DebateController {

    @Autowired
    private DebateService debateService;


    @RequestMapping("/getRecord/{key}")
    @ResponseBody
    public ZnblResult getDebateRecord(@PathVariable String key){
        ZnblResult result = debateService.getHistoryMsg(key);
        return result;
    }

//    @RequestMapping(value="/debateRoundOne")
//    @ResponseBody
    public String debateRoundOne( String msg){

        Debate debate = JsonUtils.jsonToPojo("msg",Debate.class);
        int num = debate.getNum();


        if(num == 0){

            debate.setID(+1);
            debate.setTime(150);
            debate.setNum(0);
            String message = JsonUtils.objectToJson(debate);
            return message;
           // return Msg.success().add("debate",debate);
        }else if(num == 1){

            debate.setID(-1);
            debate.setTime(150);
            debate.setNum(1);
            String message = JsonUtils.objectToJson(debate);
            return message;
            //return Msg.success().add("debate",debate);
        }
        return null;
    }


//    @RequestMapping("/debateRoundTwo")
//    @ResponseBody
    public String debateRoundTwo(String msg){

        Debate debate = JsonUtils.jsonToPojo("msg",Debate.class);
        int num = debate.getNum();


//        List<Integer> IDs = new ArrayList<Integer>();
//        IDs.add(-2);
//        IDs.add(-3);
//
//        List<Integer> IDss = new ArrayList<Integer>();
//        IDss.add(+2);
//        IDss.add(+3);

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
            String message = JsonUtils.objectToJson(debate);
            return message;
            //return Msg.success().add("debate",debate);
        }


        while (num == 1){
            //Debate debate = new Debate();
            // debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(10);
            debate.setNum(1);
            String message = JsonUtils.objectToJson(debate);
            return message;
            //return Msg.success().add("debate",debate);
        }


        while (num == 2){
//            Debate debate = new Debate().add("num",num);
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(20);
            debate.setNum(2);
            String message = JsonUtils.objectToJson(debate);
            return message;
            //return Msg.success().add("debate",debate);
        }


        while (num == 3){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(10);
            debate.setNum(3);
            String message = JsonUtils.objectToJson(debate);
            return message;
           // return Msg.success().add("debate",debate);
        }


        while (num == 4){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(20);
            debate.setNum(4);
            String message = JsonUtils.objectToJson(debate);
            return message;
           // return Msg.success().add("debate",debate);
        }


        while (num == 5){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(10);
            debate.setNum(5);
            String message = JsonUtils.objectToJson(debate);
            return message;
            //return Msg.success().add("debate",debate);
        }


        while (num == 6){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(20);
            debate.setNum(6);
            String message = JsonUtils.objectToJson(debate);
            return message;
            //return Msg.success().add("debate",debate);
        }

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
            String message = JsonUtils.objectToJson(debate);
            return message;
            //return Msg.success().add("debate",debate);
        }


        while (num == 8){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(10);
            debate.setNum(8);
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
            String message = JsonUtils.objectToJson(debate);
            return message;
           // return Msg.success().add("debate",debate);
        }


        while (num == 10){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(10);
            debate.setNum(10);
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
            String message = JsonUtils.objectToJson(debate);
            return message;
            //return Msg.success().add("debate",debate);
        }


        while (num == 12){
            //Debate debate = new Debate();
            //debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(10);
            debate.setNum(12);
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
            String message = JsonUtils.objectToJson(debate);
            return message;
           // return Msg.success().add("debate",debate);
        }


        while (num == 15){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(10);
            debate.setNum(15);
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
            String message = JsonUtils.objectToJson(debate);
            return message;
            //return Msg.success().add("debate",debate);
        }


        while (num == 17){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(10);
            debate.setNum(17);
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
            String message = JsonUtils.objectToJson(debate);
            return message;
            //return Msg.success().add("debate",debate);
        }


        while (num == 19){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(10);
            debate.setNum(19);
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
            String message = JsonUtils.objectToJson(debate);
            return message;
            //return Msg.success().add("debate",debate);
        }


        while (num == 22){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(10);
            debate.setNum(22);
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
            String message = JsonUtils.objectToJson(debate);
            return message;
            //return Msg.success().add("debate",debate);
        }


        while (num == 24){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(10);
            debate.setNum(24);
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
            String message = JsonUtils.objectToJson(debate);
            return message;
           // return Msg.success().add("debate",debate);
        }


        while (num == 26){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(debate.getChoice());
            debate.setTime(10);
            debate.setNum(26);
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
            String message = JsonUtils.objectToJson(debate);
            return message;
            //return Msg.success().add("debate",debate);
        }

        return  null;

    }


//    @RequestMapping("/debateRoundThere")
//    @ResponseBody
    public String debateRoundThere(String msg){

        Debate debate = JsonUtils.jsonToPojo("msg",Debate.class);
        int round = debate.getRound();
        int num = debate.getNum();

        if(num == 0){
//            Debate debate = new Debate();
//            debate.setJD(JD);
            debate.setID(+1);
            debate.setTime(90);
            debate.setNum(0);
            String message = JsonUtils.objectToJson(debate);
            return message;
            //return Msg.success().add("debate",debate);
        }else if(num == 1){

            debate.setID(-1);
            debate.setTime(90);
            debate.setNum(1);
            String message = JsonUtils.objectToJson(debate);
            return message;
            //return Msg.success().add("debate",debate);
        }
        return null;
    }



    public String debateRoundFour(String msg){

        Debate debate = JsonUtils.jsonToPojo("msg",Debate.class);
        int round = debate.getRound();
        int PosReTime = debate.getPosReTime();
        int NegReTime = debate.getNegReTime();
        int ID = debate.getID();
        int judgement = debate.getJudgement();

        if(judgement == 1 && ID<0 && PosReTime != 0){
            debate.setSignal(1);
            debate.setID(1);
            debate.setPosReTime(PosReTime);
            debate.setNegReTime(NegReTime);
            String message = JsonUtils.objectToJson(debate);
            return message;
            //return Msg.success().add("debate",debate);
        }else if(judgement == 1 && ID>0 && NegReTime != 0){
            debate.setSignal(1);
            debate.setID(1);
            debate.setPosReTime(PosReTime);
            debate.setNegReTime(NegReTime);
            String message = JsonUtils.objectToJson(debate);
            return message;
           // return Msg.success().add("debate",debate);
        }else if(PosReTime == 0 && NegReTime == 0){
            debate.setPosReTime(0);
            debate.setNegReTime(0);
            String message = JsonUtils.objectToJson(debate);
            return message;
            //return Msg.success().add("debate",debate);
        }else if(judgement == 0){
            debate.setSignal(0);
            debate.setPosReTime(PosReTime);
            debate.setNegReTime(NegReTime);
            String message = JsonUtils.objectToJson(debate);
            return message;
            //return Msg.success().add("debate",debate);
        }

        return null;

    }


//    @RequestMapping("/debateRoundFive")
//    @ResponseBody
    public String debateRoundFive(String msg){

        Debate debate = JsonUtils.jsonToPojo("msg",Debate.class);
        int num = debate.getNum();

        if(num == 0){

            debate.setID(+4);
            debate.setTime(240);
            debate.setNum(0);
            String message = JsonUtils.objectToJson(debate);
            return message;
           // return Msg.success().add("debate",debate);
        }else if(num == 1){

            debate.setID(-4);
            debate.setTime(240);
            debate.setNum(1);
            String message = JsonUtils.objectToJson(debate);
            return message;
            //return Msg.success().add("debate",debate);
        }
        return null;
    }


}
