package com.company;
import java.util.Scanner;
import java.util.Arrays;


public class _03_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int Highest_size  = sc.nextInt();
        int [] Marks = new int [Highest_size];

        System.out.println("Enter the elements of the array : ");
        for(int i=0;i< Marks.length;i++){
            Marks[i] = sc.nextInt();
        }

        for (int Mark : Marks) {
            System.out.println(Mark);
        }

        System.out.println(Arrays.toString(Marks));
    }
}
