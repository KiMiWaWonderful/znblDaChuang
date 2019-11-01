package com.znbl.pojo;

import java.util.List;

public class Debate {

    private String debateId;

    private String debateName;

    private String debateDesc;

    public String getDebateId() {
        return debateId;
    }

    public void setDebateId(String debateId) {
        this.debateId = debateId;
    }

    public String getDebateName() {
        return debateName;
    }

    public void setDebateName(String debateName) {
        this.debateName = debateName;
    }

    public String getDebateDesc() {
        return debateDesc;
    }

    public void setDebateDesc(String debateDesc) {
        this.debateDesc = debateDesc;
    }

    public Debate(String debateId, String debateName, String debateDesc) {
        this.debateId = debateId;
        this.debateName = debateName;
        this.debateDesc = debateDesc;
    }

    Integer ID;
    List<Integer> IDs;
    Integer time;
    Integer num;
    Integer choice;

    Integer round;//阶段
    Integer judgement;//判断
    Integer signal;//标志
    Integer PosReTime;//正方剩余时间
    Integer NegReTime;//反方剩余时间

//    String name;
//    String msg;
//    String roleId;
//    String num;



    public Debate() {
        super();
    }

    public Debate(Integer num,  Integer round) {
        this.num = num;

        this.round = round;
    }

    public Debate(Integer num, Integer choice, Integer round) {
        this.num = num;
        this.choice = choice;
        this.round = round;
    }

    public Debate(Integer round, Integer judgement, Integer signal, Integer posReTime, Integer negReTime) {
        this.round = round;
        this.judgement = judgement;
        this.signal = signal;
        PosReTime = posReTime;
        NegReTime = negReTime;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public List<Integer> getIDs() {
        return IDs;
    }

    public void setIDs(List<Integer> IDs) {
        this.IDs = IDs;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getChoice() {
        return choice;
    }

    public void setChoice(Integer choice) {
        this.choice = choice;
    }

    public Integer getRound() {
        return round;
    }

    public void setRound(Integer round) {
        this.round = round;
    }

    public Integer getJudgement() {
        return judgement;
    }

    public void setJudgement(Integer judgement) {
        this.judgement = judgement;
    }

    public Integer getSignal() {
        return signal;
    }

    public void setSignal(Integer signal) {
        this.signal = signal;
    }

    public Integer getPosReTime() {
        return PosReTime;
    }

    public void setPosReTime(Integer posReTime) {
        PosReTime = posReTime;
    }

    public Integer getNegReTime() {
        return NegReTime;
    }

    public void setNegReTime(Integer negReTime) {
        NegReTime = negReTime;
    }

    @Override
    public String toString() {
        return "Debate{" +
                "ID=" + ID +
                ", IDs=" + IDs +
                ", time=" + time +
                ", num=" + num +
                ", choice=" + choice +
                ", round=" + round +
                ", judgement=" + judgement +
                ", signal=" + signal +
                ", PosReTime=" + PosReTime +
                ", NegReTime=" + NegReTime +
                '}';
    }

    //    public String getDebateId() {
//        return debateId;
//    }
//
//    public void setDebateId(String debateId) {
//        this.debateId = debateId;
//    }
//
//    public String getDebateName() {
//        return debateName;
//    }
//
//    public void setDebateName(String debateName) {
//        this.debateName = debateName;
//    }
//
//    public String getDebateDesc() {
//        return debateDesc;
//    }
//
//    public void setDebateDesc(String debateDesc) {
//        this.debateDesc = debateDesc;
//    }
//
//    public Debate(String debateId, String debateName, String debateDesc) {
//        this.debateId = debateId;
//        this.debateName = debateName;
//        this.debateDesc = debateDesc;
//    }


}
