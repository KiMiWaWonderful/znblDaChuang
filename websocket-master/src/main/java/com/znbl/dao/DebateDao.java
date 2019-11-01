package com.znbl.dao;

import com.znbl.pojo.Debate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DebateDao {

    private Debate d1;
    private Debate d2;
    List<Debate> list;

    public DebateDao(){
        d1 = new Debate("001","godie?","test1");
        d2 = new Debate("002","getmoney","test2");
        list = new ArrayList<>();
        list.add(d1);
        list.add(d2);
    }


    public List<Debate> getAllDebate(){
        return list;
    }


    public Debate getDebateById(String DebateId){
        for(Debate d : list){
            if(d.getDebateId().equals(DebateId)){
                return d;
            }
        }
        return null;
    }

}
