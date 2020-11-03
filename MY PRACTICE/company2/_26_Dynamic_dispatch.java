package com.opps;

class Phonee{
    public void on(){
        System.out.println("Phone is turning on....");
    }
    public void name(){
        System.out.println("Name is Samsung");
    }
}

class SmartPhonee extends Phonee{
    public void on(){
        System.out.println("Turning on smartphone....");
    }

    public void greet(){
        System.out.println("Good Morning");
    }
}

public class _26_Dynamic_dispatch {
    public static void main(String[] args){
        Phonee P1 = new SmartPhonee();
        P1.on();   //// as the method is available in both phone and smartphone so smartphone edited method runs in this case
        P1.name(); //// Name method is only available in Phonee class so it runs
//        P1.greet();   //// This will show error statement as greet is not a method of a phonee class

    }
}
