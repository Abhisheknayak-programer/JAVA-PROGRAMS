package com.IMPORTANT_2021;
import java.util.*;
import java.util.ArrayList;

public class _54_Linked_List_In_Java {
        public static void main(String[] args){
            LinkedList<Integer> arr = new LinkedList<>();
            LinkedList<Integer> newArr = new LinkedList<>();

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


            // Some Extra Functions That The Linked List Contains
            System.out.println("\n");
            newArr.removeFirst();
            newArr.removeLast();
            newArr.addFirst(1901206041);
            newArr.addLast(1901206041);
            newArr.removeFirstOccurrence(1901206041);
            newArr.removeLastOccurrence(1901206041);

            System.out.println("The First Node Of The Linked List Have The Value Of " + newArr.getFirst());
            System.out.println("The Last Node Of The Linked List Have The Value Of " + newArr.getLast());
        }
    }



