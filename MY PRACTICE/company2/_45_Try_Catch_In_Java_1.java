package com.IMPORTANT_2021;
import java.util.Scanner;

public class _45_Try_Catch_In_Java_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter The Value Of A : ");
        a = sc.nextInt();
        System.out.println("Enter The Value Of A : ");
        b = sc.nextInt();
        try{
            int c = a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("End Of The Program :) ");
    }
}
