package com.newer.Computer;

import com.newer.dao.CPU;
import com.newer.Ram.Ram;

public abstract class AbstractMainboard implements CPU,Ram {

    public String getName(){
        return null;
    }
    public double getPrice(){
        return 0;
    }
    public String getCompany(){
        return null;
    }
    public int getSpeed(){

        return 0;
    }
    public void doInstr(){

    }
    public void outResult(){

    }
    public int getSize(){
        return 0;
    }
    public void inData(){

    }
    public void outData(){

    }
}
