package com.IMPORTANT_2021;
import java.util.Scanner;

public class _46_Nested_Try_Catch_In_java_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = new int [3];
        marks[0] = 4000;
        marks[1] = 2000;
        marks[2] = 6000;

        System.out.println("Enter The Index You Want To Divide With : ");
        int index = sc.nextInt();

        System.out.println("Enter The number You Want To divide With The selected Index : ");
        int value = sc.nextInt();

        try{

            try {
                System.out.println("The Selected Value From The Array is " + marks[index]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("The Provided Index Does Not Have Any Existence :} ");
                System.out.println(e);
                System.out.println("Exception Caught At Level 1");
            }

//            try {
//                System.out.println("The Value After The Division is " + marks[index]/value);
//            }catch (ArithmeticException e){
//                System.out.println("The Output Dividing Problem So Better To pass a value which can be divided easily :}");
//                System.out.println(e);
//                System.out.println("Exception Caught At Level 2");
//            }



        }
        catch (Exception e){
            System.out.println("The Exception Caught Level 3");
            System.out.println(e);
        }


    }
}
