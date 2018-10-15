package com.newer.dao;

import java.util.List;

import com.newer.pojo.Clazz;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface ClazzMapper {
	@Select("select * from clazz")
	List<Clazz> findAll();
}
