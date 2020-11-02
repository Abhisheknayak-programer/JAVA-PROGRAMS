package com.opps;

class box_x1{
    box_x1(){
        System.out.println("I am the Default constructor of box_x1");
    }
    box_x1(int a){
        System.out.println("I am constructor of the first class " + a);
    }
}

class box_x2 extends  box_x1{
    box_x2(){
        System.out.println("I am the Default constructor of box_x2");
    }

    box_x2(int a,int b){
        super(a);
        System.out.println("I am constructor of the Second class " + b);
    }
}

class box_x3 extends  box_x2{
    box_x3() {
        System.out.println("I am the Default constructor of box_x1");
    }

    box_x3(int a,int b,int c){
        super(a,b);
        System.out.println("I am constructor of the third class " + c);
    }
}

public class _22_constructor_in_inheritance {
    public static void main(String[] args){
        //box_x1 x = new box_x1(18);
        //box_x2 y = new box_x2(12,1);
        box_x3 z = new box_x3(1,2,3);
    }
}
