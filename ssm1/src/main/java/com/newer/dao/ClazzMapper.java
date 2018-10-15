package com.newer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.newer.pojo.Clazz;

/*
 * 操作数据库Clazz表的方法类
 */
public interface ClazzMapper {
	
	//查找单个班级表数据
	@Results(value= {@Result(id=true,property="clazzid",column="id"),
			@Result(property="title",column="title")})
	@Select("select * from clazz where id=#{clazzid}")
	Clazz findById(@Param("clazzid") int clazzid);
	
	//查找所有班级表数据
	@Results(value= {@Result(id=true,property="clazzid",column="id"),
			@Result(property="title",column="title")})
	@Select("select * from clazz")
	List<Clazz> findAll();
}
