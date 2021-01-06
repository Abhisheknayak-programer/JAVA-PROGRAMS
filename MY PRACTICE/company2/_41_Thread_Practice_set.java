package com.IMPORTANT;

class My_Thread extends  Thread{
    public  void run() {
        while (true) {
            System.out.println("Good Morning");
        }
    }
}

class My_Thread_2 extends  Thread{
    public  void run(){
        while(true){
            System.out.println("Welcome");
        }
    }
}

public class _41_Thread_Practice_set {
    public  static  void main(String[] args){
        My_Thread m1 = new My_Thread();
        My_Thread_2 m2 = new My_Thread_2();

        m1.start();
        m2.start();
    }
}
