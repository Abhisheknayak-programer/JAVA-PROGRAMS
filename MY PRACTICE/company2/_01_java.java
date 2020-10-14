package com.company2;

public class _01_java {
    static  int logic(int x,int y){
        int z;
        if(x>y){
            z = (x+y)*5;
            return  z;
        }else {
            z = (x+y)/5;
            return  z;
        }
    }
    public static void main(String[] args) {
        int a =200;
        int b=100;
       int c = logic(a,b);
        System.out.println("When the value of a is more than b then the value came "+c);

       int a1 = 100;
       int b1 = 200;
       int c1 = logic(a1,b1);
        System.out.println("When the value of b1 is more than a1 then the value came "+c1);
    }
}
