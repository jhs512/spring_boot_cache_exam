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
	int showMain() {
		return randomNumberGenerator.getRandom();
	}

	@RequestMapping("/usr/home/abandonGetRandomCacheData")
	@ResponseBody
	String doAbandonGetRandomCacheData() {
		randomNumberGenerator.abandonGetRandomCacheData();

		return "캐시비우기";
	}
}