package com.opps;

class Ek{
    int a;
    Ek(int a){
        this.a = a;
    }

    public int getA() {
        return a;
    }
}

class  Do extends Ek{
    Do(int a) {
        super(a);
        System.out.println("The value is " + a);
    }
}

public class _24_this_in_java {
    public static void main(String[] args) {
        Ek e = new Ek(1);
        System.out.println(e.getA());

        Do d  = new Do(12);

    }
}
