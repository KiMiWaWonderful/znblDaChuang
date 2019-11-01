package com.znbl.service;

import com.znbl.dao.DebateDao;
import com.znbl.dao.JedisClient;
import com.znbl.pojo.Debate;
import com.znbl.pojo.User;
import com.znbl.pojo.ZnblResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class DebateService {

    @Autowired
    private DebateDao debateDao;

    @Autowired
    private JedisClient jedisClient;

    public ZnblResult getAllDebate(){

        List<Debate> list = debateDao.getAllDebate();
        return ZnblResult.ok(list);

    }

    public void choiceDebate(String debateId, HttpServletRequest request){
        HttpSession session = request.getSession(false);
        User user = (User) session.getAttribute("user");
        user.setDebateId(debateId);
        session.setAttribute("user",user);
        request.setAttribute("user",user);
    }


    public ZnblResult getHistoryMsg(String key) {
        Long lLen = jedisClient.lLen(key);
        List list = jedisClient.lRange(key, 0L, lLen);
        return ZnblResult.ok(list);
    }
}
