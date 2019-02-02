package com.company;

public class Bed {
    private String style;
    private int height;
    private int pillow;
    private int sheets;

    public Bed(String style, int height, int pillow, int sheets){
        this.style = style;
        this.height = height;
        this.pillow = pillow;
        this.sheets = sheets;
    }

    public void make(){
        System.out.println("Bed.make() from Bed called. Making Bed! ");
    }

    public String getStyle(){
        return style;
    }

    public int getHeight(){
        return height;
    }

    public int getPillow() {
        return pillow;
    }

    public int getSheets() {
        return sheets;
    }
}
