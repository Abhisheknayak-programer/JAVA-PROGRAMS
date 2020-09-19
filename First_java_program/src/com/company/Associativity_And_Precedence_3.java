package com.company;
import java.util.Scanner;


public class Associativity_And_Precedence_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter The Number 2 : ");
        int num2 = sc.nextInt();
        System.out.println("Enter The Number 3 : ");
        int num3 = sc.nextInt();


        int Functionality = num1*num2-num3;
//        Here Precedence Method is Used

        System.out.println("The Answer Will be " +  Functionality);
    }
}
