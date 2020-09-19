package com.company;

import  java.util.Scanner;

public class InputTaker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Roll No.");
        int Roll = sc.nextInt();
        System.out.println("Your Roll No. is "+ Roll);


        System.out.println("Enter The Book Name ");
        String Book = sc.next();
//        String Book = sc.nextLine();
        System.out.println("The Book Name Is " +Book);

        System.out.println("Enter The Book Price ");
        float bookPrice = sc.nextFloat();
        System.out.println("The Book Price Is " +bookPrice);


        System.out.println("Enter The Element To Check Whether Its Integer Or Not ");
        Boolean b1 = sc.hasNextInt();
        System.out.println(b1);
    }
}
