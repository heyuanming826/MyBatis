package com.newer.printer;

import com.newer.printer.ink.Ink;
import com.newer.printer.paper.Paper;

public class Printer {
    private Ink ink;
    private Paper paper;

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public void printer(int r,int g,int b, String countent){
        System.out.println("打印色号:"+ink.getColor(r,g,b));

        //按纸张大小重新排版
        for (int i=0;i<countent.length();i++){
            paper.putChar(countent.charAt(i));
        }
        System.out.println(paper.getContext());
    }
}