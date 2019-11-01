package com.znbl.common.service;

import com.znbl.common.entity.NegPlayer;

import java.util.List;

public interface NegPlayerService {

    //增加反方选手
    public void addNegPlayer();

    //统计反方的人数
    public int numsOfNegPlayer();

    //得到反方的集合
    public List<NegPlayer> listsOfNegPlayer();

    //根据neg_id得到反方选手
    public NegPlayer getNegPlayer(Integer neg_id);

    //反方选手发表Debate
    public void insertNegDebate(Integer neg_id,String debate);

    //反方选手发表Question
    public void insertNegQuestion(Integer neg_id,String question);

    //反方选手发表Conclusion
    public void insertNegConclusion(Integer neg_id,String conclusion);

    //比赛结束后清空表中所有数据
    public void deleteAll();
}
