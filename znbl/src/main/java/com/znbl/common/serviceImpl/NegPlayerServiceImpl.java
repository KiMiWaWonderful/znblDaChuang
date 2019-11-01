package com.znbl.common.serviceImpl;

import com.znbl.common.entity.NegPlayer;
import com.znbl.common.mapper.NegPlayerMapper;
import com.znbl.common.service.NegPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class NegPlayerServiceImpl implements NegPlayerService {

    @Autowired
    NegPlayerMapper negPlayerMapper;

    //增加反方选手
    public void addNegPlayer() {
        negPlayerMapper.addNegPlayer();
    }

    //统计反方的人数
    public int numsOfNegPlayer() {
        return negPlayerMapper.numsOfNegPlayer();
    }

    //得到反方的集合
    public List<NegPlayer> listsOfNegPlayer() {
        return negPlayerMapper.listsOfNegPlayer();
    }

    //根据neg_id得到反方选手
    public NegPlayer getNegPlayer(Integer neg_id) {
        return negPlayerMapper.getNegPlayer(neg_id);
    }

    //正方选手发表Debate
    public void insertNegDebate(Integer neg_id,String debate) {
        negPlayerMapper.insertNegDebate(neg_id,debate);
    }

    //正方选手发表Question
    public void insertNegQuestion(Integer neg_id,String question) {
        negPlayerMapper.insertNegQuestion(neg_id,question);
    }

    //正方选手发表Conclusion
    public void insertNegConclusion(Integer neg_id,String conclusion) {
        negPlayerMapper.insertNegConclusion(neg_id,conclusion);
    }

    //比赛结束后清空表中所有数据
    public void deleteAll() {
        negPlayerMapper.deleteAll();
    }

    //为集合随机分配1,2,3,4.(随机分配方法未写出)
    public void allocateRandomly(List<NegPlayer> listOfNeg) {
        //为正方随机分配
        for(Iterator iterators = listOfNeg.iterator(); iterators.hasNext();){
            //获取当前遍历的元素，指定为posPlayer对象
            NegPlayer negPlayer = (NegPlayer) iterators.next();
            //Integer pos_id = role.//指定为1,2,3,4辩
        }

    }
}
