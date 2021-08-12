package com.example.demo.repository;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.example.demo.vo.Article;

@Component
public class ArticleRepository {
	@CachePut(cacheNames = "ArticleRepository__addArticleCached", key = "#article.id")
	public Article addArticleCached(Article article) {
		return article;
	}

	@Cacheable("ArticleRepository__addArticleCached")
	public Article getArticleCached(int id) {
		return null;
	}
}
