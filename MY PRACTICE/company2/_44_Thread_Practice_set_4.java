package com.IMPORTANT;

class  MyThe extends  Thread{
    public  void run(){
        int i=0;
        while(i<100){
            System.out.println("My Name is Abhishek");
            i++;
        }
    }
}


public class _44_Thread_Practice_set_4 {
    public static void main(String[] args) {
        MyThe m1 = new MyThe();
        m1.start();
        System.out.println(m1.getState());

//      When The start is running it will show the runnable and when the start is not running or object.start() is not used then it will show new !
    }
}
