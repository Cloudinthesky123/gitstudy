package com.atguigu.redis.test;

import redis.clients.jedis.Jedis;

public class TestPing {
	public static void main(String[] args) 
	{
		System.out.println("hello");
		Jedis jedis = new Jedis("127.0.0.1",6379);
		System.out.println(jedis.ping());
	}
}
