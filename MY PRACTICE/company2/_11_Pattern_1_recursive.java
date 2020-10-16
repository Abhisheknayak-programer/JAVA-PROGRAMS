package com.company2;

public class _11_Pattern_1_recursive {
    static  void Pattern_1(int n){
        if(n>0){
            Pattern_1(n-1);
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern_1(4);
    }
}
