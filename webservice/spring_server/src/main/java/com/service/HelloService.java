package com.service;
import javax.jws.WebService;


@WebService
public interface HelloService {

    //对外发布服务的接口的方法
    public String sayHello(String name);
}
