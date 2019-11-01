package com.znbl.controller;


import com.znbl.pojo.User;
import com.znbl.pojo.ZnblResult;
import com.znbl.utils.JsonUtils;
import me.gacl.websocket.WebSocketTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {


    @RequestMapping("/test")
    public ZnblResult testGetJson(){

        List list = new ArrayList();
//        User u1 = new User(String id, String name, Integer roleId , String debateId)
        User u1 = new User("1", "a", 1 , "10086");
        User u2 = new User("2", "b", 2 , "10086");
        User u3 = new User("3", "c", 3 , "10086");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        WebSocketTest web = null;
        String s = JsonUtils.objectToJson(list);
        try {
            web = new WebSocketTest();
            web.onMessage(s,null);
        }catch (Exception e){
            System.out.println("web  ==  " + web);
            System.out.println(e);
        }

        return ZnblResult.ok(list);

    }

}
