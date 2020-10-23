package com.company;
import  java.util.Scanner;
//import  java.util.Random;

public class GuessNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Random random = new Random();


        int Rand = 1+(int)(10*Math.random());
        int i,trials=5;


        System.out.println("A number you will choose you have 5 chances to win the game or else you will lose the game !");

        for(i=0;i<trials;i++){
            System.out.println("Guess The number : ");
            int userChoice =  sc.nextInt();
            if(userChoice == Rand){
                System.out.println("Congratulations You win ! You have guessed that in " + i + " times" );
                break;
            }else if(userChoice > Rand && i!= trials-1){
                System.out.println("Your Guess Number "+ userChoice  +" is More Than the Winning Number");
            }else{
                System.out.println("Your Value "+ userChoice  +" is Less Than the Winning Number");
            }
        }


        if(i == trials){
            System.out.println("Your number of trials is exhausted !");
            System.out.println("The Winning number was " + Rand);
        }



        }
}
