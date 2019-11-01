package com.znbl.dao;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * jdies dao接口
 * 
 * @author Administrator
 * 
 */
@Component
public interface JedisClient {

	String get(String key);

	String set(String key, String value);

	String hget(String hkey, String hget);

	long hset(String hkey, String key, String value);

	// 返回一个自增长整形
	long incr(String key);

	/**
	 * 设置有效期，单位秒，-1为永久,-2为过期 命令: expire key 1000(设置过期时间)
	 * 
	 * @param key
	 * @param second
	 * @return
	 */
	long expire(String key, int second);

	/**
	 * 命令: 192.168xxx> ttl key (查询剩多少时间) ;
	 * 
	 * @param key
	 * @return
	 */
	long ttl(String key);

	long del(String key);

	long hdel(String hkey, String key);

	Long lPush(String lkey, String value);

	List lRange(String lkey,Long start,Long end);

	Long lLen(String key);

}
