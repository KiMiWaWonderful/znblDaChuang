package com.znbl.dao.impl;

import com.znbl.dao.JedisClient;
import org.springframework.beans.factory.annotation.Autowired;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.List;


/**
 * 单机版jedis dao
 * 
 * @author Administrator
 * 
 */
public class JedisClientSingle implements JedisClient {

	// 根据JedisPool这个类型在spring容器中查找是否有，有则自动注入 byType;@Resource是byName
	@Autowired
	private JedisPool jedisPool;

	@Override
	public String get(String key) {
		Jedis jedis = jedisPool.getResource();
		String string = jedis.get(key);
		jedis.close();
		return string;
	}

	@Override
	public String set(String key, String value) {
		Jedis jedis = jedisPool.getResource();
		String string = jedis.set(key, value);
		jedis.close();
		return string;
	}

	@Override
	public String hget(String hkey, String key) {
		Jedis jedis = jedisPool.getResource();
		String string = jedis.hget(hkey, key);
		jedis.close();
		return string;
	}

	@Override
	public long hset(String hkey, String key, String value) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.hset(hkey, key, value);
		jedis.close();
		return result;
	}

	@Override
	public long incr(String key) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.incr(key);
		jedis.close();
		return result;
	}

	@Override
	public long expire(String key, int second) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.expire(key, second);
		jedis.close();
		return result;
	}

	@Override
	public long ttl(String key) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.ttl(key);
		jedis.close();
		return result;
	}

	@Override
	public long del(String key) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.del(key);
		jedis.close();
		return result;
	}

	@Override
	public long hdel(String hkey, String key) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.hdel(hkey, key);
		jedis.close();
		return result;
	}

	@Override
	public Long lPush(String lkey, String value) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.lpush(lkey, value);
		jedis.close();
		return result;
	}


	@Override
	public List lRange(String lkey, Long start, Long end) {
		Jedis jedis = jedisPool.getResource();
		List<String> messages = jedis.lrange(lkey, start, end);
		jedis.close();
		return messages;
	}

	@Override
	public Long lLen(String lkey) {
		Jedis jedis = jedisPool.getResource();
		Long llen = jedis.llen(lkey);
		jedis.close();
		return llen;
	}

}