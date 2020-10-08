package com.company;
import  java.util.Scanner;

public class _06_CHECK_SORTED_OR_NOT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int [4];

        System.out.println("Enter the array to chcek : ");
        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        int reference_value = array[0];
        boolean Value = false;

        for(int a=1;a< array.length;a++){
            if(array[a]<=reference_value){
                Value = true;
            }
            else {
                Value = false;
            }
        }

        for(int a=1;a< array.length;a++){
            if(array[a]>=reference_value){
                Value = true;
            }else {
                Value = false;
            }
        }

        System.out.println(Value);

    }
}
