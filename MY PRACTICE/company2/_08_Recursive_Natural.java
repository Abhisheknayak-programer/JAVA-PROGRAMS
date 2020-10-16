package com.company2;
import java.util.Scanner;


public class _08_Recursive_Natural {
    static int Natural_recursive_sum(int max_num){
        if(max_num == 1){
            return  1;
        }else{
            return  max_num + Natural_recursive_sum(max_num-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number to find the sum of all the Numbers below that : ");
        int max = sc.nextInt();
        int sum =0;

        sum = Natural_recursive_sum(max);
        System.out.println(sum);

    }
}
