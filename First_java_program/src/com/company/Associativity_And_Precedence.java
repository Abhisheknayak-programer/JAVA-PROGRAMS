package com.company;
import java.util.Scanner;

public class Associativity_And_Precedence {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Value Of Num1");
            int num1 = sc.nextInt();
        System.out.println("Enter The Value Of Num2");
            int num2 = sc.nextInt();

            int Functionality = num1-num2/2;
            // Here in the above case you may be confused what will happen but here
            // num2 is first divided by the 2 then the value will come that value is substracted from num1
            // assume num1=10 num2=4
            // now num2/2 = 4/2 = 2
            // then 10 - 2 will be 8 This is due to presedence property

            System.out.println("The Value After The Process Will Be : " + Functionality);

    }
}
