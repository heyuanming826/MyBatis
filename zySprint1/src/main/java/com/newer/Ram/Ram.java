package com.newer.Ram;

import com.newer.dao.PCComponent;

public interface Ram extends PCComponent {

    //大小
    public int getSize();
    //里面数据
    public void inData();
    //外面数据
    public void outData();
}
