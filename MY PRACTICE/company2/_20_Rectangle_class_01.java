package com.opps;

class RecTangle{
    private int length;
    private int breadth;


    public RecTangle(){
        this.length = 4;
        this.breadth = 5;
    }

    public void setLength(int len){
        this.length = len;
    }

    public void setBreadth(int bre){
        this.breadth = bre;
    }

    public int getLength(){
        return length;
    }

    public int getBreadth(){
        return  breadth;
    }

    public  int area(int l ,int b){
        return l*b;
    }
    public  int area(){
        return this.length*this.breadth;
    }
}


public class _20_Rectangle_class_01 {
    public static void main(String[] args) {
        RecTangle R = new RecTangle();
        System.out.println(R.area());
    }
}
