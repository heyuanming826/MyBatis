package com.newer.dao;

public interface CPU extends PCComponent {

    //速度
    public int getSpeed();
    //指示书
    public void doInstr();
    //结果
    public void outResult();

}
