package com.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class Client {

    //注入对象
    //@Resource
    @Autowired
    private HelloService helloService;

    @Test
    public  void remote(){
        System.out.println(helloService.getClass());
        System.out.println(helloService.sayHello("jerry"));
    }
}
