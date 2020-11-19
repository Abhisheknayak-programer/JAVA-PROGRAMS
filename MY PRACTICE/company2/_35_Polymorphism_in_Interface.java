package com.IMPORTANT;


interface  tvRemote{
    void Change(int channel);
    void NotChange();
}

interface SmartTVRemote extends tvRemote{
    void previousChannel();
    void NightMode();
    void MusicMode();
}

class  TV implements  tvRemote{
    public void Change(int channel){
        System.out.println("Shifting to channel number "+ channel);
    }

    public void NotChange(){
        System.out.println("Do not change the channel");
    }

}

interface Night{
    void NightMode();
}

class  SmartTV extends  TV implements SmartTVRemote,Night{
    public void previousChannel(){
        System.out.println("Shifting to the previous channel");
    }
    public void NightMode(){
        System.out.println("Entering Nightmode");
    }

    public void MusicMode(){
        System.out.println("Entering music Mode");
    }

}



public class _35_Polymorphism_in_Interface {
    public  static  void main(String[] args){
        SmartTV s = new SmartTV();
        s.previousChannel();
        Night n = new SmartTV();
        n.NightMode();
//        n.previousChannel();   ////----->ERROR Line

    }
}

