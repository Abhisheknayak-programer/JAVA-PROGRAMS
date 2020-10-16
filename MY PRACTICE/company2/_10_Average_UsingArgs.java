package com.company2;

public class _10_Average_UsingArgs {
    static void avg(int ...args){
        int sum = 0,avg =0;
        for(int a:args){
            sum += a;
        }
        avg = sum/(args.length);
        System.out.println(avg);
    }
    public static void main(String[] args) {
        System.out.println("The average of the  2 , 3 , 4 , 5 is :");
        avg(2,3,4,5);
    }
}
