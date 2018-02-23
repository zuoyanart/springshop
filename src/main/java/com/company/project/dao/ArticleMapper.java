package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.Article;

import java.util.List;
import java.util.Map;

public interface ArticleMapper extends Mapper<Article> {
     public  List<Article> page(Map<String, Object> queryMap);
}