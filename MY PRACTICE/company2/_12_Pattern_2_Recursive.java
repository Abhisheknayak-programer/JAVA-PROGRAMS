package com.company2;

public class _12_Pattern_2_Recursive {
    static  void Pattern_2_rec(int n){
        if(n>0){
            Pattern_2_rec(n - 1);
            for (int i=n;i>0;i--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern_2_rec(4);
    }
}
