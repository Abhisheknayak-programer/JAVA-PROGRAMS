package com.IMPORTANT_2021;
import java.util.Scanner;

public class _51_Finally_Keyword_In_Java {
    public static void main(String[] args) {
        int b = 10;
        int a = 3;
        while(true){
            try{
                System.out.println("My Value is " + a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("Kuch Bhi Hoo Mai Toh Chalunga Last Main");
                System.out.println();
            }
            b--;
        }
    }
}
