package com.IMPORTANT;

class MaiThreadHuu extends  Thread {

    public  MaiThreadHuu(String name){
        super(name);
    }

    public void run() {
        int i = 0;
        while(i <= 500) {
            System.out.println("I am the thread " + this.getName());
            i++;
        }
    }
}

public class _39_Thread_priority {
    public static void main(String[] args){
        MaiThreadHuu m1 = new MaiThreadHuu("Abhishek Nayak");
        MaiThreadHuu m2 = new MaiThreadHuu("sahil");
        MaiThreadHuu m3 = new MaiThreadHuu("Tera Dhayan Kidhar Hai Ki Tera Hero Idhar Hai :) ");
        MaiThreadHuu m4 = new MaiThreadHuu("Gabbar");

        m1.setPriority(Thread.MAX_PRIORITY);
        m2.setPriority(Thread.MIN_PRIORITY);

        m1.start();
        m2.start();
        m3.start();
        m4.start();
    }
}
