package com.company2;
import  java.util.Scanner;

public class _06_fibonacci_recursion {


    // Fibonacci series by using simple for loop
    // In This Case series start from 1

    static void fib(int size){
            int a = 1;
            int b = 1;
            int c = a+b;

            for(int i=0;i<size;i++){
                System.out.print(a + " ");
                a = b;
                b = c;
                c = a+b;
            }
    }


    // Fibonacci series using recursion
    // In This Case series start from 1
        static int fibonacci(int size){
        if(size == 1 || size == 2){
            return 1;
        }else {
            return (fibonacci(size-1) + fibonacci(size-2));
        }
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the No. of element you want to see in your series : ");
        int Series_num = sc.nextInt();

        System.out.println("================>>>>>>>> FIBONACCI SERIES <<<<<<<================");
        fib(Series_num);

        System.out.println("================>>>>>>>> FIBONACCI SERIES <<<<<<<================");
        int value = fibonacci(Series_num);
        System.out.println(value);
    }
}
