package com.hd.jedis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

public class RedisConnectTest {

	private ApplicationContext application;

	@Before
	public void setUp() {
		application = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext-*.xml");
	}

	@Test
	public void testSetValue() {
		/* 采用直接new并且不采用分布式 */
		// Jedis jedis = new Jedis("192.168.206.129", 6379);
		// jedis.set("key1", "val1");
		// System.out.println(jedis.get("test1"));
		// System.out.println(application);

		/* 采用声明式注入方式 */
		ShardedJedisPool jedisPool = (ShardedJedisPool) application
				.getBean("jedis");
		ShardedJedis jedis2 = jedisPool.getResource();
		// string测试
//		 System.out.println(jedis2.get("test1"));
//		 jedis2.sadd("set1", "a");
//		 byte val[] = new byte[3];
//		 val[0] = 1;
//		 val[1] = 2;
//		 val[2] = 3;
//		 jedis2.sadd("set2", val.toString());

		// set测试
//		Set<String> set1 = jedis2.smembers("set1");
//		for (String s : set1) {
//			System.out.println(s);
//		}

		// list测试
//		 jedis2.lpush("list1", "1");
//		 jedis2.lpush("list1", "2");
//		 List<String> list1 = jedis2.lrange("list1", 0, -1);
//		 for (String l : list1) {
//		 System.out.println(l);
//		 }
		
		// map测试
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("name", "zhangsan");
//		map.put("age", "21");
//		map.put("address", "beijing");
//		jedis2.hmset("person1", map);
//		List<String> person1 = jedis2.hmget("person1", "name", "age", "address");
//		for (String p : person1) {
//			System.out.println(p);
//		}
		
		
		
		

	}

}
