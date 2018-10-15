package com.newer.printer.paper;

public interface Paper {
public static final String NEWLINE="\r\n";
//获得排版方法
    void putChar(char ch);
    //获得要打印的内容
    String getContext();
}
