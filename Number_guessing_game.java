package com.opps;
//import  java.util.Scanner;
import  java.util.Random;
import java.util.Scanner;

class game{
    String name;
    int userChoice;
    int R_A_N_D;

    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    public game(){
        this.name = "Abhishek Nayak";
        this.userChoice = 2;
        this.R_A_N_D = 3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserChoice() {
        return userChoice;
    }

    public void setUserChoice(int userChoice) {
        this.userChoice = userChoice;
    }

    public Random getRandom() {
        return this.random;
    }



    public void check(int userChoice,int R_A_N_D){
        while(this.userChoice != this.R_A_N_D){
            if(this.userChoice == this.R_A_N_D){
                System.out.println("You win");
            }else if(this.userChoice > this.R_A_N_D){
                System.out.println("Your Value is More Than the Winning Number");
                this.userChoice = sc.nextInt();
            }else{
                System.out.println("Your Value is Less Than the Winning Number");
                this.userChoice = sc.nextInt();
            }
        }
    }

}




public class Number_guessing_game {
    public static void main(String[] args) {
        game g1 = new game();
        System.out.println("Your name is "+g1.getName());
        System.out.println("Your name is "+g1.getUserChoice());
        System.out.println("Your name is "+g1.getRandom());

        game g2 = new game();
        g2.setName("Abhishek");
        g2.setUserChoice(3);


//        System.out.println(check(g2.getUserChoice(),g2.getRandom()));


    }
}
