package com.atguigu;

import org.junit.Test;
import redis.clients.jedis.Jedis;


public class AppTest 
{

    @Test
    public void shouldAnswerWithTrue(){
        //1.建立Jedis连接
        Jedis jedis = new Jedis("192.168.150.38",6379);
        //2.使用Jedis连接操作redis服务器
      jedis.hset("zhangsan", "age","10");
      jedis.hset("zhangsan", "gender","male");

        //3.关闭jedis连接
        jedis.close();

    }
}
