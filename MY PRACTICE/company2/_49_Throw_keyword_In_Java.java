package com.IMPORTANT_2021;
import java.util.Scanner;

public class _49_Throw_keyword_In_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number To Divide With 40 :{ ");
        int Number = sc.nextInt();
        if(Number==0){
            throw  new ArithmeticException("Divided By Zero");
        }
        else {
            int c = 40/Number;
            System.out.println(c);
        }

    }
}
