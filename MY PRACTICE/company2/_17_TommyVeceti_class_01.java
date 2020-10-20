package com.company2;

class Rockstar {
    int PlayerId;

    public int getPlayerId(){
        return PlayerId;
    }

    public void Running(){
        System.out.println(PlayerId + " Running >>>>>>>>>>>>>>");
    }

    public void Firing(){
        System.out.println(PlayerId + " Firing ======-------->");
    }

    public void hitting(){
        System.out.println(PlayerId + " Heating <><><><><><><><>");
    }
}


public class _17_TommyVeceti_class_01 {
    public static void main(String[] args) {
            Rockstar R1 = new Rockstar();
            R1.PlayerId = 41;

            R1.Firing();
            R1.hitting();
            R1.Running();
    }
}
