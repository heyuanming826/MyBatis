package com.newer.printer.ink;

import java.awt.*;

public class ColorInk implements Ink {
    @Override
    public String getColor(int r, int g, int b) {

        Color color=new Color(r,g,b);

        return "#"+Integer.toHexString(color.getRGB()).substring(2);
    }
}
