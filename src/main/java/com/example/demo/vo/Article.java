package com.example.demo.vo;

import java.io.Serializable;

import lombok.Data;

@Data
public class Article implements Serializable {
	public int id;
	public String title;
}
