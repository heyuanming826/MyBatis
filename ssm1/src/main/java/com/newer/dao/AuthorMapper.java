package com.newer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.newer.pojo.Author;
import org.springframework.stereotype.Repository;

/**
 * @author shining
 *
 */
@Repository
public interface AuthorMapper {
	
	@Select("select * from author where auid=#{auid}")
	Author findById(@Param("auid") int auid);
	
	@Select("select * from author")
	List<Author> findAll();

}
