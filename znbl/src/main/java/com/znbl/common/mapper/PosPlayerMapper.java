package com.znbl.common.mapper;

import com.znbl.common.entity.PosPlayer;

import java.util.List;

public interface PosPlayerMapper {

    //增加正方选手
    public void addPosPlayer();

    //统计正方的人数
    public int numsOfPosPlayer();

    //得到正方的集合
    public List<PosPlayer> listsOfPosPlayer();

    //根据pos_id得到正方选手
    public PosPlayer getPosPlayer(Integer pos_id);

    //正方选手发表Debate
    public void insertPosDebate(Integer pos_id,String debate);

    //正方选手发表Question
    public void insertPosQuestion(Integer pos_id,String question);

    //正方选手发表Conclusion
    public void insertPosConclusion(Integer pos_id,String conclusion);

    //比赛结束后清空表中所有数据
    public void deleteAll();
}
