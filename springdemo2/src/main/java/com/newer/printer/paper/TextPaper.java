package com.newer.printer.paper;

public class TextPaper implements Paper {
    //每行打印的字符数
private int charPerLine;

    //每页打印的行数
    private int linePerPage;

    public int getCharPerLine() {
        return charPerLine;
    }

    public void setCharPerLine(int charPerLine) {
        this.charPerLine = charPerLine;
    }

    public int getLinePerPage() {
        return linePerPage;
    }

    public void setLinePerPage(int linePerPage) {
        this.linePerPage = linePerPage;
    }

    private int x=0;
    private int y=0;
    private int page=1;
    private String countent="";
    @Override
    public void putChar(char ch) {

        countent+=ch;
        x++;
        if(x==charPerLine){
            countent+=Paper.NEWLINE;
            x=0;
            y++;
        }
        if(y==linePerPage){
            countent+=Paper.NEWLINE;
            countent+="======第"+page+"页=======";
            countent+=Paper.NEWLINE;
            page++;
            y=0;
        }
    }

    @Override
    public String getContext() {
        if(y>0){
            for(int i=0;i<(linePerPage-y);i++){
                countent+=Paper.NEWLINE;
            }
            countent+=Paper.NEWLINE;
            countent+="======第"+page+"页=======";
            countent+=Paper.NEWLINE;
        }
        return countent;
    }
}
