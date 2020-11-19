package com.IMPORTANT;

abstract class pen{
    abstract void refill();
    abstract void write();
}

class FountainPen extends  pen{
    void refill(){
        System.out.println("Filling the refill inside of the pen");
    }
    void write(){
        System.out.println("Using Pen to write in a paper");
    }
}
public class _32_Practice_ques_1 {
    public static  void main(String[] args){
        FountainPen F1 = new FountainPen();
        F1.refill();
        F1.write();
    }
}
