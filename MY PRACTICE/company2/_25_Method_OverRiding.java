package com.opps;

class A{
    int a;
    public void meth1(){
        System.out.println("This is the method of the class A");
    }
    public int Abhishek(){
        return 41;
    }
}

class B extends A{
    @Override
    public void meth1(){
        System.out.println("I am method 1 now modified inside class B using Method Overriding");
    }

    public void meth2(){
        System.out.println("I am a new method method 2");
    }
}

public class _25_Method_OverRiding {
    public static void main(String[] args) {
        A a = new A();
        a.meth1();

        B b = new B();
        b.meth1();
        b.meth2();
    }
}
