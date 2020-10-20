package com.company2;

class Cellphone{
    String Name;

    public  void getCall(){
        System.out.println(Name + " Ringing Please pick it up Fast !");
    }

    public void Vibrate_phone(){
        System.out.println(Name + " is Vibrating make it silent now !!!");
    }

    public void SetCellPhoneName(String n){
        Name = n;
    }
}

public class _15_Cellphone_class_01 {
    public static void main(String[] args) {
        Cellphone C1 = new Cellphone();
        C1.SetCellPhoneName("Realme 6"); //My phone :)
        C1.getCall();
        C1.Vibrate_phone();
    }
}
