package com.opps;
import java.util.Scanner;
import  java.util.Random;

public class Stone_paper_scissor {

    static void computer_statement(int computer_input){
        if(computer_input == 0){
            System.out.println("Computers Choice : Stone");
        }else if(computer_input == 1){
            System.out.println("Computers Choice : Paper");
        }else{
            System.out.println("Computers Choice : Scissor");
        }
    }

    public static void main(String[] args) {
        // 0 - stone
        // 1 - paper
        // 2 - scissor
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int computer_input = random.nextInt(3);


        System.out.println("Enter 0 for Stone || 1 for Paper || 2 for Scissors");
        int user_input = sc.nextInt();
        if(user_input>2){
            System.out.println("Enter A Value in between 0 to 3");
        }else{

            if(user_input == computer_input){
                System.out.println("Match Draw");
                computer_statement(computer_input);
            }else if(user_input == 0 && computer_input == 2 || user_input == 1 && computer_input ==0 || user_input == 2 && computer_input == 1){
                System.out.println("You Win!!");
                computer_statement(computer_input);
            }else{
                computer_statement(computer_input);
                System.out.println("Computer Win Better Luck Next Time !");
            }

        }


    }

}
