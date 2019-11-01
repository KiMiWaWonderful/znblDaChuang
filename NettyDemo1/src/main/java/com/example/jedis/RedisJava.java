package com.example.jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;

public class RedisJava {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("47.101.181.42",6381);
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: "+jedis.ping());

//        jedis.set("hello","world");
//        System.out.println(jedis.get("hello"));
//        System.out.println(jedis.get("world"));

//        System.out.println(System.currentTimeMillis());
//        for (int i = 0; i < 5000; i++) {
//            jedis.hset("key"+i,"field"+i,"value"+i);
//        }
//        System.out.println(System.currentTimeMillis());

        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < 5000; i++) {
            Pipeline pipeline = jedis.pipelined();
            for (int j = i*100; j <(i+1)*100 ; j++) {
                pipeline.hset("key"+j,"field"+j,"value"+j);
            }
            pipeline.syncAndReturnAll();
        }
        System.out.println(System.currentTimeMillis());

    }
}
