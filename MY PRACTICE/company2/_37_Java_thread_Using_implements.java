package com.IMPORTANT;

class testing1 implements  Runnable{
    public void run(){
        for(int i =0;i<10000;i++){
            System.out.println("I am Method 1 <><><><><><><><>");
        }
    }
}

class  testing2 implements  Runnable{
    public  void run(){
        for(int i =0;i<10000;i++){
            System.out.println("<<<<<<<<<<<<<<<<<<<   I am Method 2 >>>>>>>>>>>>>>");
        }
    }
}


public class _37_Java_thread_Using_implements {
    public  static  void main(String[] args){
        testing1 t1 = new testing1();
        Thread t1Runner = new Thread(t1);

        testing2 t2 = new testing2();
        Thread t2Runner = new Thread(t2);

        t1Runner.start();
        t2Runner.start();

    }
}
