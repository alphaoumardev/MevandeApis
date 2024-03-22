package com.mev.cloud.common.cache.bo;

import lombok.Getter;
import lombok.Setter;

/**
 * 通过 cacheName 配置 和 时间告诉缓存多久清楚一遍
 *
 * @author Alphaoumardev
 * @date 2020/7/4
 */
@Setter
@Getter
public class CacheNameWithTtlBO
{
	private String cacheName;
	private Integer ttl;

	public CacheNameWithTtlBO(String cacheName, Integer ttl)
	{
		this.cacheName = cacheName;
		this.ttl = ttl;
	}

	@Override
	public String toString() {
		return "CacheNameWithTtlBO{" + "cacheName='" + cacheName + '\'' + ", ttl=" + ttl + '}';
	}

}
