package com.IMPORTANT_2021;
import java.util.Scanner;

public class _47_TRY_Catch_Practice_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[3];
        marks[0] = 4000;
        marks[1] = 2000;
        marks[2] = 6000;
        boolean flag = true;

        while(flag) {
            System.out.println("Enter The Index You Want To Divide With : ");
            int index = sc.nextInt();

            try {

                try {
                    System.out.println("The Selected Value From The Array is " + marks[index]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("The Provided Index Does Not Have Any Existence :} ");
                    System.out.println("Exception Caught At Level 1");
                }
            } catch (Exception e) {
                System.out.println("The Exception Caught Level 3");
                System.out.println(e);
            }
        }
    }
}