package com.aaa.ssm.util;

import redis.clients.jedis.Jedis;

/**
 * fileName:TestRedisConnect
 * description:测试能否和redis链接是否成功
 * author:zz
 * createTime:2019/3/2 17:36
 */
public class TestRedisConnect {

    public static void main(String[] args) {
        Jedis jedis =  new Jedis("192.168.131.20",6379);
        System.out.println(jedis.ping());
       System.out.println(SerializeUtil.serialize("userList"));

    }
}
