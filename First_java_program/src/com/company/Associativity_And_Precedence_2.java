package com.company;
import java.util.Scanner;


public class Associativity_And_Precedence_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value Of A : ");
        float a = sc.nextFloat();
        System.out.println("Enter The Value Of B : ");
        float b = sc.nextFloat();
        System.out.println("Enter The Value Of C : ");
        float c = sc.nextFloat();


        double Ans = b*b*4*a*c/2*a;
        // assume b = 2  so b*b = 4 then 4*4 = 16
        // assume a = 3 so 16*3 = 48
        // then assume c = 1 so 48*1 = 48
        // then 48/2 = 24 then 24*a = 24*3 = 72 ans
        //this is due to associativity property.

//        double Ans = ((b*b) * (4*a*c)) / (2*a);      ////// Use This For Perfect Answer

        System.out.println("The Value Of Your Functionality Will Be : "+Ans);

    }
}
