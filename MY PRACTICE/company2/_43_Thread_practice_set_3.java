package com.IMPORTANT;

class MyTh extends  Thread{
    public void run(){
        while(true){
            System.out.println("MY Name Is Abhishek Nayak");
        }
    }
}


class  MyTh2 extends  Thread{
    public void run(){
        while(true){
            System.out.println("Abhishek//Kshitun");
        }
    }
}


public class _43_Thread_practice_set_3 {
    public static void main(String[] args) {
        MyTh m1 = new MyTh();
        m1.setPriority(6);
        MyTh2 m2 = new MyTh2();
        m2.setPriority(9);

//        m1.start();
//        m2.start();


        System.out.println(m1.getPriority());
        System.out.println(m2.getPriority());

//        when we are not setting the priority then the default priority of the object is 5
    }
}
