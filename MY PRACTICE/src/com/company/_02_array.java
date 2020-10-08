package com.company;
import java.util.Scanner;


public class _02_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        int [][] home = home = new int[4][4];
        for (i=0;i<4;i++){
            for(j=0;j<3;j++){
                System.out.print(home[i][j]);
            }
            System.out.println();
        }
    }
}
