package com.example.demo.util;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class RandomNumberGenerator {
	@Cacheable("common")
	public int getRandom(int addNum) {
		Ut.sleep(1000);

		return (int) (Math.random() * 100) + addNum;
	}

	@CacheEvict(value = "common", allEntries = true)
	public void doAbandonCacheDataAllAboutGetRandom() {

	}

	@CacheEvict(value = "common")
	public void doAbandonCacheDataAboutGetRandom(int addNum) {

	}
}
