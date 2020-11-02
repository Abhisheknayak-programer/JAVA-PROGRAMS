package com.opps;

class  Num1{
    Num1(){
        System.out.println("Myself Num1");
    }
    Num1(int x){
        System.out.println("I am from the first class " + x);
    }
}

class Num2 extends  Num1{
    Num2(){
        System.out.println("Myself Num2");
    }
    Num2(int x,int y){
        super(x);
        System.out.println("I am from the second class " + y);
    }
}

class  Num3 extends  Num2{
    Num3(){
        System.out.println("Myself Num3");
    }
    Num3(int x,int y,int z){
        super(x,y);
        System.out.println("I am from the Third class " + z);
    }
}

class  Num4 extends  Num3{
    Num4(){
        System.out.println("Myself Num4");
    }
    Num4(int x,int y,int z,int oops){
        super(x,y,z);
        System.out.println("I am from the Last class " + oops);
    }
}


public class _23_Constructor_Inheritance2 {
    public static void main(String[] args){
        Num4 n4 = new Num4(1,2,3,30);
    }
}
