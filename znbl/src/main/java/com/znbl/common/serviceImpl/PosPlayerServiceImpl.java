package com.znbl.common.serviceImpl;

import com.znbl.common.entity.PosPlayer;
import com.znbl.common.mapper.PosPlayerMapper;
import com.znbl.common.service.PosPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class PosPlayerServiceImpl implements PosPlayerService {

    @Autowired
    PosPlayerMapper posPlayerMapper;

    //增加正方选手
    public void addPosPlayer() {
        posPlayerMapper.addPosPlayer();
    }

    //统计正方的人数
    public int numsOfPosPlayer() {
        return posPlayerMapper.numsOfPosPlayer();
    }

    //得到正方的集合
    public List<PosPlayer> listsOfPosPlayer() {
        return posPlayerMapper.listsOfPosPlayer();
    }

    //根据pos_id得到正方选手
    public PosPlayer getPosPlayer(Integer pos_id) {
        return posPlayerMapper.getPosPlayer(pos_id);
    }

    //正方选手发表Debate
    public void insertPosDebate(Integer pos_id,String debate) {
        posPlayerMapper.insertPosDebate(pos_id,debate);
    }

    //正方选手发表Question
    public void insertPosQuestion(Integer pos_id,String question) {
        posPlayerMapper.insertPosQuestion(pos_id,question);

    }

    //正方选手发表Conclusion
    public void insertPosConclusion(Integer pos_id,String conclusion) {
        posPlayerMapper.insertPosQuestion(pos_id,conclusion);
    }

    //比赛结束后清空表中所有数据
    public void deleteAll() {
        posPlayerMapper.deleteAll();
    }

    //为集合随机分配1,2,3,4.(随机分配方法未写出)
    public void allocateRandomly(List<PosPlayer> listOfPos) {
        //为正方随机分配
        for(Iterator iterators = listOfPos.iterator(); iterators.hasNext();){
            //获取当前遍历的元素，指定为posPlayer对象
            PosPlayer posPlayer = (PosPlayer) iterators.next();
            //Integer pos_id = role.//指定为1,2,3,4辩
        }

    }
}
