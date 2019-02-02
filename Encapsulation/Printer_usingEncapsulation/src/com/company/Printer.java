package com.company;

public class Printer {

    private Pages pageCount;
    private Pages pagesUtilized;


    public Printer(Pages pageCount, Pages pagesUtilized){

        this.pageCount = pageCount;
        this.pagesUtilized = pagesUtilized;

    }

    public Pages getPageCount() {
        return pageCount;
    }

    public Pages getPagesUtilized() {
        return pagesUtilized;
    }

}
