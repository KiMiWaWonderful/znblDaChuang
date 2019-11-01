package com.znbl.common.entity;

import java.util.List;

//正方选手
public class PosPlayer {

    Integer id;

    //与user的id关联
    Integer u_id;

    //1，2，3，4辩
    Integer pos_id;

    //辩论发言
    String debate;

    //提出问题
    List<String> questions;
    String question;

    //攻辩小结
    String conclusion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPos_id() {
        return pos_id;
    }

    public void setPos_id(Integer pos_id) {
        this.pos_id = pos_id;
    }

    public String getDebate() {
        return debate;
    }

    public void setDebate(String debate) {
        this.debate = debate;
    }

    public List<String> getQuestions() {
        return questions;
    }

    public void setQuestions(List<String> questions) {
        this.questions = questions;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
}
