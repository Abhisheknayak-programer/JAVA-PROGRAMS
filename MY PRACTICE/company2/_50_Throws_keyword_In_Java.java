package com.IMPORTANT_2021;
import java.sql.SQLOutput;
import java.util.Scanner;

public class _50_Throws_keyword_In_Java {
    public  static  int divide () throws  ArithmeticException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Numerator: ");
        int Numerator = sc.nextInt();
        System.out.println("Enter The Denominator");
        int Denominator = sc.nextInt();

        int c = Numerator/Denominator;
        System.out.println("The Value After The Division is : " + c);
        return c;
    }
    public static void main(String[] args) {

        try{
            divide();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
