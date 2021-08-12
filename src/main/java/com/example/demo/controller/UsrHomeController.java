package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.repository.ArticleRepository;
import com.example.demo.util.RandomNumberGenerator;
import com.example.demo.vo.Article;

// TDD, 오류를 발생, 오류 해결, 중복제거
@Controller
public class UsrHomeController {
	@Autowired
	RandomNumberGenerator randomNumberGenerator;
	@Autowired
	ArticleRepository articleRepository;

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

	@RequestMapping("/usr/home/main2")
	@ResponseBody
	int showMain2(int addNum) {
		return randomNumberGenerator.getRandom2(addNum);
	}

	@RequestMapping("/usr/home/doAbandonCacheDataAllAboutGetRandom2")
	@ResponseBody
	String doAbandonCacheDataAllAboutGetRandom2() {
		randomNumberGenerator.doAbandonCacheDataAllAboutGetRandom2();

		return "캐시비우기";
	}

	@RequestMapping("/usr/home/doAbandonCacheDataAboutGetRandom2")
	@ResponseBody
	String doAbandonCacheDataAboutGetRandom2(int addNum) {
		randomNumberGenerator.doAbandonCacheDataAboutGetRandom2(addNum);

		return "캐시비우기";
	}

	@RequestMapping("/usr/home/addArticle")
	@ResponseBody
	String doAddArticle(Article article) {
		articleRepository.addArticleCached(article);

		return "캐시비우기";
	}

	@RequestMapping("/usr/home/getArticle")
	@ResponseBody
	Article getArticle(int id) {
		return articleRepository.getArticleCached(id);
	}
}