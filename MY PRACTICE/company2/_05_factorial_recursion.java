package com.company2;
import java.util.Scanner;

public class _05_factorial_recursion {

    static  int Fact(int n){
        if(n == 0 || n == 1){
            return  1;
        }else{
            return  n * Fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number for which you want to see the Factorial : ");
        int num = sc.nextInt();

        System.out.println("The Factorial of the Number is : " + Fact(num));
    }
}
