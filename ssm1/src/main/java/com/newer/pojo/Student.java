package com.newer.pojo;

import java.io.Serializable;

/*
 * Student表实体类
 */
public class Student implements Serializable{
	private Integer stuid;
	private String name;
	private String phone;
	private Clazz clazz;
	
	public Integer getStuid() {
		return stuid;
	}
	public void setStuid(Integer stuid) {
		this.stuid = stuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Clazz getClazz() {
		return clazz;
	}
	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}
	
	
	

}
