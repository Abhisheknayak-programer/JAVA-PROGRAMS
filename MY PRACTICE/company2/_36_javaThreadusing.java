package com.IMPORTANT;
class mytest1 extends Thread{
    public  void run(){
        int i =0;
        while(i<10000){
            System.out.println("This Is The Thread 1 Of The Test 1 Method ~~~~~~~");
            i++;
        }
    }
}

class  mytest2 extends  Thread{
    public  void run(){
        int i =0;
        while(i<10000){
            System.out.println("This Is The Thread 2 Of The Test 2 Method *******");
            i++;
        }
    }
}


public class _36_javaThreadusing {
    public static  void main(String[] args){
        mytest1 m1 = new mytest1();
        mytest2 m2 = new mytest2();

        m1.start();
        m2.start();
    }
}
