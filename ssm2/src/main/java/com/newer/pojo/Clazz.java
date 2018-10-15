package com.newer.pojo;

import java.io.Serializable;

/*
 * Clazz表实体类
 */
public class Clazz implements Serializable{
	
	private Integer clazzid;
	private String title;
	
	public Integer getClazzid() {
		return clazzid;
	}
	public void setClazzid(Integer clazzid) {
		this.clazzid = clazzid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	

}
