package com.example.demo.util;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class RandomNumberGenerator {
	@Cacheable("common")
	public int getRandom() {
		Ut.sleep(3000);

		return (int) (Math.random() * 100);
	}
	
	@CacheEvict(value="common", allEntries=true)
	public void abandonGetRandomCacheData() {
		
	}
}
