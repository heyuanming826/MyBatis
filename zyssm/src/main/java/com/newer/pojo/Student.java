package com.newer.pojo;

import java.io.Serializable;

public class Student implements Serializable{
	
	private Integer id;
	private String name;
	private String phone;
	private Integer clazz_id;
	private Clazz clazz;
	
	
	public Integer getClazz_id() {
		return clazz_id;
	}
	public void setClazz_id(Integer clazz_id) {
		this.clazz_id = clazz_id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
