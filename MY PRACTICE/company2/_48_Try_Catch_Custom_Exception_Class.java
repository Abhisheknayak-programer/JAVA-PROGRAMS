package com.IMPORTANT_2021;

import java.util.Scanner;

class MyException extends Exception{
    public  String toString(){
        return  "I am a string()";
    }
    public  String getMessage(){
        return  "I am a getMessages()";
    }
}

public class _48_Try_Catch_Custom_Exception_Class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number To Compare it with 9 : ");
        a = sc.nextInt();
        if(a<9){
            try {
                throw new MyException();
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
            }
        }
    }
}
