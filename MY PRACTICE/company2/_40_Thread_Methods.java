package com.IMPORTANT;

class thread_a extends  Thread{
    public  void run(){
        int i = 0;
        while (i < 500){
            System.out.println("Thanks a Lot");
            i++;
        }
    }
}



class thread_b extends  Thread{
    public  void run(){
        int i = 0;
        while (i < 500){
            System.out.println("Thanks a Lot Ganesha");
            i++;
        }
    }
}


public class _40_Thread_Methods {
    public static void main(String[] args) {
        thread_a a1 = new thread_a();
        thread_b a2 = new thread_b();
        a1.start();
        try {
            a1.join();
        }catch (Exception e){
            System.out.println(e);
        }
        a2.start();
    }
}
