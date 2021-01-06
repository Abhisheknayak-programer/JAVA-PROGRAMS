package com.IMPORTANT;


class My_Thread3 extends  Thread{
    public  void run() {
        while (true) {
            System.out.println("Good Morning");
        }
    }
}

class My_Thread_4 extends  Thread{
    public  void run(){
        while(true){
            try{
                Thread.sleep(3000);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}


public class _42_Thread_practice_set_2 {
    public static void main(String[] args) {
        My_Thread3 m1 = new My_Thread3();
        My_Thread_4 m2 = new My_Thread_4();

        m1.start();
        m2.start();

    }
}
