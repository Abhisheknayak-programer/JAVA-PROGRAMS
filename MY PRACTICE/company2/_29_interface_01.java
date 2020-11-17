package com.IMPORTANT;

interface  Bicycle{
    void applyBrakes(int decrease);
    void SpeedUp(int increase);
}

class Hercules implements  Bicycle{
    public int speed = 204;
    public void applyBrakes(int BrakesPower){
        this.speed = this.speed-BrakesPower;
        System.out.println("Your speed is now " + speed);
    }
    public void SpeedUp(int ExtraSpeed){
        this.speed = this.speed+ExtraSpeed;
        System.out.println("Your speed is now " + speed);
    }
}


public class _29_interface_01 {
    public static void main(String[] args) {
        Hercules h1 = new Hercules();
        h1.applyBrakes(2);
        h1.SpeedUp(200);
    }
}
