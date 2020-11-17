package com.IMPORTANT;

abstract  class PhoneModel{
    abstract void switchOff();
    abstract  void showHimalaya();
}
class  smartphonewah extends  PhoneModel{

    @Override
    public void switchOff(){
        System.out.println("Switch off ho gaya");
    }

    @Override
    public void showHimalaya(){
        System.out.println("Showing the Way To Himalaya");
    }
}


class SmartestPhoneEver extends smartphonewah{
    public void showTeeth(){
        System.out.println("HIHIHIHIHI");
    }

    public  void showHimalaya(){
        System.out.println("No Network is there in phone to show");
    }
}

abstract class ExtraSmart  extends  smartphonewah{
    public void jump(){
        System.out.println("Jumping from the seventh floor");
    }
}



public class _28_Abstract_01 {
    public static void main(String[] args) {
//        PhoneModel p1 = new PhoneModel();     ////--->cannot be initiated as it is an abstract class
//        ExtraSmart es1 = new ExtraSmart();    ////--->cannot be initiated as it is an abstract class

        smartphonewah s1 = new smartphonewah();
        s1.switchOff();
        s1.showHimalaya();
        SmartestPhoneEver ss1 = new SmartestPhoneEver();
        ss1.showTeeth();
        ss1.showHimalaya();       ////---->Method is overridden in this case
    }
}
