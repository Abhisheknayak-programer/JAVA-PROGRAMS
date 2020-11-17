package com.IMPORTANT;

class Phone{
    public void Calling(){
        System.out.println("Calling To My Abhishek Sir");
    }
    public  void Endcall(){
        System.out.println("Ending The Call With Sir");
    }
}

interface  camera{
    void TakePic();
    void Time(int time);
    default void greet(){
        System.out.println("Good Morning");
    }
}

interface  wifi{
    double Range();
    void connectionDone();
}

interface gps{
    void fetchingGps();
    private void Greet(){
        System.out.println("Good Evening");
    }
    default void greetings(){
        Greet();
    }
}


class Smartphone extends  Phone implements camera,wifi,gps{
    public void TakePic(){
        System.out.println("Khachak");
    }
    public void Time(int time){
        System.out.println("Time is Now "+ time);
    }
    public double Range(){
        return 577.26727;
    }
    public void connectionDone(){
        System.out.println("The connection setup done");
    }
    public void fetchingGps(){
        System.out.println("Trying To Fetch the gps network from  america");
    }
}




public class _31_Multiple_inheritance {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone();
        s1.connectionDone();
        s1.fetchingGps();
        System.out.println("The Range of The Wifi is " + s1.Range());
        s1.TakePic();
        s1.Time(12);
        s1.greet();
        s1.greetings();
    }
}
