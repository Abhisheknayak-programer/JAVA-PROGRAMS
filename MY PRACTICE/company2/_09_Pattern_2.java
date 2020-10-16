package com.company2;

public class _09_Pattern_2 {
    public static void main(String[] args) {
        for(int i=1;i<5;i++){
            for(int j=0;j<5-i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
