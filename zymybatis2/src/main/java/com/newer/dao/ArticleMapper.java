package com.newer.dao;

import com.newer.bean.Article;

import java.util.List;

public interface ArticleMapper {

    List<Article> findById(int arId);
}
