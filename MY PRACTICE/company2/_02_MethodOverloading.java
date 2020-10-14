package com.company2;

public class _02_MethodOverloading{
    static void message(){
        System.out.println("God Bless You Bro!");
    }
    static void message(int a){
        System.out.println("God Bless You Bro! " + a);
    }
    static void message(int a,int b){
        System.out.println("God Bless You Bro! " + a + b);
    }
    static int message(int a,int b,int c){
        int x;
        x = a+b+c;
        return  x;
    }
    public static void main(String[] args) {
        message();
        message(1);
        message(1,2);
        int c = message(1,2,3);
        System.out.println("The Value sum of three numbers is "+c);
    }
}
