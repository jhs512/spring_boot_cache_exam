package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.util.RandomNumberGenerator;

// TDD, 오류를 발생, 오류 해결, 중복제거
@Controller
public class UsrHomeController {
	@Autowired
	RandomNumberGenerator randomNumberGenerator;

	@RequestMapping("/usr/home/main")
	@ResponseBody
	int showMain(int addNum) {
		return randomNumberGenerator.getRandom(addNum);
	}

	@RequestMapping("/usr/home/doAbandonCacheDataAllAboutGetRandom")
	@ResponseBody
	String doAbandonCacheDataAllAboutGetRandom() {
		randomNumberGenerator.doAbandonCacheDataAllAboutGetRandom();

		return "캐시비우기";
	}
	
	@RequestMapping("/usr/home/doAbandonCacheDataAboutGetRandom")
	@ResponseBody
	String doAbandonCacheDataAboutGetRandom(int addNum) {
		randomNumberGenerator.doAbandonCacheDataAboutGetRandom(addNum);

		return "캐시비우기";
	}
}