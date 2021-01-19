package com.IMPORTANT_2021;
import java.util.*;

public class _53_ArrayList {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> newArr = new ArrayList<>();
        ArrayList<Integer> arrCloned = new ArrayList<>();

        arr.add(4);
        arr.add(21);
        arr.add(1345);
        arr.add(213);
        arr.add(31);
        arr.add(1);
        arr.add(921);
        arr.add(0,2871);
        arr.add(1);

        newArr.addAll(0,arr);
        newArr.add(0,123);
        newArr.set(0,999);
        newArr.remove(1);

//        newArr.clear();

        for(int i=0;i<newArr.size();i++){
            System.out.println(newArr.get(i));
        }

        System.out.println("The array Contains "+ arr.contains(921));
        System.out.println("The array Contains "+ arr.contains(92));
        System.out.println("The Last Index Of The Array is "+ newArr.lastIndexOf(1));
        System.out.println("The Size Of The Array is : " + arr.size());
        System.out.println("The Index Of 921 is : " + arr.indexOf(921));
        System.out.println("The Index Of 9 is : " + arr.indexOf(9));

        System.out.println("I am a empty Arraylist : " + arrCloned.isEmpty());

    }
}
