package com.newer.Computer;

import com.newer.dao.CPU;
import com.newer.dao.PCComponent;

public interface Mainboard extends PCComponent {


    public void setCpu(CPU cpu );
    public CPU getCpu();
    public void setRam();
    public CPU getRam();
    public boolean havePower();
    public void  startPower();
    public void shutdownPower();
}
