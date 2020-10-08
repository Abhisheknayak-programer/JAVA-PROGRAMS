package com.company;
import java.util.Scanner;
//import  java.util.Arrays;

public class _05_ADDING_OF_TWO_MULTI_ARRAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The size of matrix Rows : ");
        int Rows = sc.nextInt();
        System.out.println("Enter The size of matrix Cols : ");
        int Cols = sc.nextInt();

        int[][] matrix1 = new int[Rows][Cols];
        int[][] matrix2 = new int[Rows][Cols];
        int[][] matrix3 = new int[Rows][Cols];

        System.out.println("Enter the matrix 1 : ");
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Cols; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the matrix 2 : ");
            for (int i = 0; i < Rows; i++) {
                for (int j = 0; j < Cols; j++) {
                    matrix2[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < Rows; i++) {
                for (int j = 0; j < Cols; j++) {
                    matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            for (int i = 0; i < Rows; i++) {
                for (int j = 0; j < Cols; j++) {
                    System.out.print(matrix3[i][j]);
                }
                System.out.println();
            }

    }
}