package com.IMPORTANT;

interface  mobile{
    void switchOn();
    void switchOff();
    void PlayMusic();
    default void Calling(){
        System.out.println("calling Some One");
    }
}

class  Motorolaa implements  mobile{
    public void switchOn(){
        System.out.println("Switching On the Phone");
    }
    public void switchOff(){
        System.out.println("Switching off the Phone");
    }
    public void PlayMusic(){
        System.out.println("Playing Channa Mereya");
    }

    public void  NayaHuMain(){
        System.out.println("mai ek testing bala method huu mera kuch kaam nahi hai");
    }
}




class  NayaPhone implements  mobile {
    public void switchOn() {
        System.out.println("Switching On the Phone");
    }

    public void switchOff() {
        System.out.println("Switching off the Phone");
    }

    public void PlayMusic() {
        System.out.println("Playing Channa Mereya");
    }

    public  void Calling(){
        System.out.println("Calling Abhishek Sir");
    }

    public  void Calling(String s1){
        System.out.println("Calling To ===> " + s1);
    }

}


public class _30_InterFace_using_default {
    public static void main(String[] args) {
        Motorolaa m1 = new Motorolaa();
        m1.Calling();
        System.out.println();

        NayaPhone n1 = new NayaPhone();
        n1.Calling();
        System.out.println();

        n1.Calling("7077358291");
    }
}
