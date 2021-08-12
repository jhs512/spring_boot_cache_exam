package com.example.demo.util;

import org.springframework.stereotype.Component;

import com.example.demo.util.Ut;

@Component
public class RandomNumberGenerator {
	public int getRandom() {
		Ut.sleep(3000);

		return (int) (Math.random() * 100);
	}
}
