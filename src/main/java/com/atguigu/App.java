package com.atguigu;

import redis.clients.jedis.HostAndPort;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        Set<HostAndPort> nodes = new HashSet<HostAndPort>();

        nodes.add(new HostAndPort("192.168.150.38",7291));

        redis.clients.jedis.JedisCluster jedisCluster = new redis.clients.jedis.JedisCluster(nodes);

        jedisCluster.set("username","admin");


        String username = jedisCluster.get("username");
        System.out.println(username);
        jedisCluster.close();
    }
}
