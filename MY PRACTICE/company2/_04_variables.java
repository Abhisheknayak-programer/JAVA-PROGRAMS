package com.company2;


public class _04_variables {

    static  int add(int ...arr){
        int sum = 0;
        for(int element:arr){
            sum = sum + element;
        }
        return  sum;
    }

    public static  void main(String[] args){
        System.out.println("Addition of 2 numbers are : " + add(1,2));
    }
}
