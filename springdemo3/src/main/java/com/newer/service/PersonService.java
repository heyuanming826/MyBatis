package com.newer.service;

public class PersonService {
    private String name;
    public void addPerson(){
        System.out.println("完成用户添加用户");
    }
    public void deletePerson(){
        throw new IllegalArgumentException();
    }

    public void findPerson(int pid){
        System.out.println("查询"+pid+"用户信息");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
