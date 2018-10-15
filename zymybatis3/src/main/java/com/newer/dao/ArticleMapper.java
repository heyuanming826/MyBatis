package com.newer.dao;

import com.newer.bean.Article;

import java.util.List;
import java.util.Map;

public interface ArticleMapper {
    List<Article> findAll(Map<String,Object> params);
}
