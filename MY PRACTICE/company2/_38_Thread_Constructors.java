package com.IMPORTANT;

class MyThreads extends  Thread{
    public  MyThreads(String name){
        super(name);
    }
    public void run(){
        int i = 456;
        System.out.println("Run Method Is Running");
    }
}



public class _38_Thread_Constructors {
    public static void main(String[] args) {
        MyThreads m1 = new MyThreads("Abhishek");
        m1.start();
        System.out.println("The Id of the Thread is " + m1.getId());
        System.out.println("The Name of the Thread is " + m1.getName());


        MyThreads m2 = new MyThreads("Sahil");
        m2.start();
        System.out.println("The Id of the Thread is " + m2.getId());
        System.out.println("The Name of the Thread is " + m2.getName());
        System.out.println("The Name of the Thread is " + m2.isAlive());
        System.out.println("The Name of the Thread is " + m2.isDaemon());

    }
}
