package com.newer.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.newer.pojo.Clazz;


public interface ClazzService {
	
	List<Clazz> findAll();
	Clazz findById(@Param("clazzid") int clazzid);

}
