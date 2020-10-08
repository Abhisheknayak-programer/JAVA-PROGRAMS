package com.company;
import java.util.Scanner;


public class _04_MAX_ELEMENT_IN_ARRAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Total Number of the element of the array : ");
        int max_length = sc.nextInt();
        int [] array = new int [max_length];

        System.out.println("Enter the elements of the  array : ");
        for(int i=0;i< array.length;i++){
            array[i] = sc.nextInt();
        }
        int max =0;

        for(int i=0;i< array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }

        System.out.println("The Max From The Given Array Is : " +max);
    }
}
