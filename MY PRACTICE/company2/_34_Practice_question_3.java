package com.IMPORTANT;

abstract class telePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartPhonee extends  telePhone {
    void ring(){
        System.out.println("Ringing The Phone");
    }
    void lift(){
        System.out.println("Lifting The Phone");
    }
    void disconnect(){
        System.out.println("Disconnecting The Phone");
    }
}

public class _34_Practice_question_3 {
    public static void main(String[] args){
        SmartPhonee s11 = new SmartPhonee();
        s11.disconnect();

        telePhone l1 = new SmartPhonee();
        l1.disconnect();
    }
}
