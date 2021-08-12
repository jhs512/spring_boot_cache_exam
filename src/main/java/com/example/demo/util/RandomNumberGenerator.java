package com.example.demo.util;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class RandomNumberGenerator {
	@Cacheable("RandomNumberGenerator__getRandom2")
	public int getRandom2(int addNum) {
		Ut.sleep(1000);

		return (int) (Math.random() * 100) + addNum;
	}

	@Cacheable("RandomNumberGenerator__getRandom")
	public int getRandom(int addNum) {
		Ut.sleep(1000);

		return (int) (Math.random() * 100) + addNum;
	}

	@CacheEvict(value = "RandomNumberGenerator__getRandom", allEntries = true)
	public void doAbandonCacheDataAllAboutGetRandom() {

	}

	@CacheEvict(value = "RandomNumberGenerator__getRandom")
	public void doAbandonCacheDataAboutGetRandom(int addNum) {

	}

	@CacheEvict(value = "RandomNumberGenerator__getRandom2", allEntries = true)
	public void doAbandonCacheDataAllAboutGetRandom2() {

	}

	@CacheEvict(value = "RandomNumberGenerator__getRandom2")
	public void doAbandonCacheDataAboutGetRandom2(int addNum) {

	}
}
