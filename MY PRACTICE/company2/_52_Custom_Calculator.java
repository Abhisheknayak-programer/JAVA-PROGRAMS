package com.IMPORTANT_2021;
import  java.util.Scanner;

class MyCustomException extends  Exception{
    public String toString(){
        return "Invalid Input Exception";
    }
    public String getMessage() {
        return "";
    }

}



class calculator{
    public int addition(int num1,int num2){
        return  num1+num2;
    }
    public int subtraction(int num1,int num2){
        return  num1-num2;
    }
    public int Multiplication(int num1,int num2){
        return num1*num2;
    }
    public int division(int num1,int num2){
        return  num1/num2;
    }
}




public class _52_Custom_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter The Second Number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter 1 for Addition, 2 for Subtraction, 3 for multiplication, 4 for division : ");
        int selectedFunction = sc.nextInt();

        try {
            if (num1 < 100000 && num2 < 100000) {
                try {
                    calculator c = new calculator();
                    if (selectedFunction == 1) {
                        System.out.println(c.addition(num1, num2));
                    } else if (selectedFunction == 2) {
                        System.out.println(c.subtraction(num1, num2));
                    } else if (selectedFunction == 3) {
                        if(num1<7000 && num2<7000) {
                            try {
                                System.out.println(c.Multiplication(num1, num2));
                                throw new MyCustomException();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }else
                        {
                            System.out.println("MAX LIMIT IS 7000 ");
                        }


                    } else if (selectedFunction == 4) {
                        System.out.println(c.division(num1, num2));
                    } else {
                        System.out.println("Invalid Input");
                    }

                } catch (ArithmeticException e) {
                    System.out.println("Cannot Divide By Zero");
                }
                catch (Exception e){
                    System.out.println(e.toString());
                }
            }else{
                System.out.println("Number Cannot Be Greater Than 100000");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
