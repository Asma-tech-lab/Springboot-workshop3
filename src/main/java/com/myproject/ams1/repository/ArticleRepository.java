package com.myproject.ams1.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myproject.ams1.entities.Article;

@Repository

public interface ArticleRepository extends CrudRepository <Article, Long>{

}

