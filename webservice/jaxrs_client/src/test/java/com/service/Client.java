package com.service;

import com.service.entity.User;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import javax.ws.rs.core.MediaType;

public class Client {

    @Test
    public void testSave(){
        User user = new User();
        user.setId(100);
        user.setUsername("jerry");
        user.setCity("gz");

        WebClient.create("http://localhost:8001/ws/userService/user")
                .type(MediaType.WILDCARD_TYPE.APPLICATION_JSON)
                .post(user);
    }
    @Test
    public  void testGet(){
        User user =
                WebClient.create("http://localhost:8001/ws/userService/user/1")
                .accept(MediaType.WILDCARD_TYPE.APPLICATION_JSON)
                .get(User.class);

        System.out.println(user);
    }
}
