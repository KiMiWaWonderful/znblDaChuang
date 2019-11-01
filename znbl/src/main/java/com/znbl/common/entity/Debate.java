package com.znbl.common.entity;

import java.util.List;

public class Debate {


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

    public Debate(Integer round, Integer ID, List<Integer> IDs, Integer time) {
        this.round = round;
        this.ID = ID;
        this.IDs = IDs;
        this.time = time;
    }

    public Debate(Integer round, Integer ID,Integer time) {
        this.round = round;
        this.ID = ID;
        this.time = time;
    }

    public Debate() {
    }

    public Integer getChoice() {
        return choice;
    }

    public void setChoice(Integer choice) {
        this.choice = choice;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getRound() {
        return round;
    }

    public void setRound(Integer round) {
        this.round = round;
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
                "round=" + round +
                ", ID=" + ID +
                ", IDs=" + IDs +
                ", time=" + time +
                ", num=" + num +
                ", choice=" + choice +
                ", judgement=" + judgement +
                ", signal=" + signal +
                ", PosReTime=" + PosReTime +
                ", NegReTime=" + NegReTime +
                '}';
    }
}
