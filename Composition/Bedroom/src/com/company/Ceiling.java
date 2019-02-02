package com.company;

public class Ceiling {

    private int height;
    private String ceilingColor;

    public Ceiling(int height, String ceilingColor){
        this.height = height;
        this.ceilingColor = ceilingColor;
    }

    public int getHeight(){
        return height;
    }

    public String getCeilingColor(){
        return ceilingColor;
    }
}
