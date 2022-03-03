package com.moshpackage;

import java.util.Random;
import java.util.Scanner;

public class ParentClass implements InterfaceClass {
        Scanner sc = new Scanner(System.in);
        public void greet(){
            greetInt();
        }
        public void name(){
            nameInt();
        }
        public void age(){
            ageInt();
        }
        public void count() {
            countInt();
        }
        public void play(){
            playInt();
        }
        public void game(){
            gameInt();
        }
        public void farewell() {
            farewellInt();
        }


    @Override
    public void greetInt() {
        System.out.println("Hello My Name is Chatty Cathy !");
        System.out.println("I was created on May 19, 1955.");
    }

    @Override
    public void nameInt() {
        System.out.println("Please remind me of your name ?");
        String str= sc.nextLine();
        System.out.println("What a great name you have " + str + " !");
    }

    @Override
    public void ageInt() {
        System.out.println("Let me guess your age.\n" +
                "Enter remainders of dividing your age by 3, 5, and 7.");
        int age3= sc.nextInt();
        int age5= sc.nextInt();
        int age7= sc.nextInt();
        int age = (age3 * 70 + age5 * 21 + age7 * 15) % 105;
        System.out.println("Your age is "+age+" that's a good time to start programming!");


    }

    @Override
    public void countInt() {
        System.out.println("Now I will prove to you that I can count to any number you want.\n" + " Pick a number");
        int count = sc.nextInt();
        for(int i=0; i<=count; i++ ){
            System.out.println(i+"!");

        }
    }

    @Override
    public void playInt() {
        System.out.println("Here is a Riddle for you. If you can answer correctly you will win a new Iphone");
        System.out.println("Notice : Packing and Shipping is handled by Santa Clause from North Pole.");
        System.out.println("Pointing to an old man, Kailash said, \"His son is my son's uncle\". How is the old man related to Kailash?");
        System.out.println("OPTION 1 : Brother");
        System.out.println("OPTION 2 : Uncle");
        System.out.println("OPTION 3 : Father");
        System.out.println("OPTION 4 : Grand Father");
        System.out.println("Enter the Correct Option");

        boolean flag = true;
        int ans = sc.nextInt();

        while(flag == true){
            if(ans == 3){
                flag = false;
                break;
            }
            else
                System.out.println("Wrong answer. Please try again.");

            ans = sc.nextInt();
        }

        if(flag == false){
            System.out.println("CONGO ! You Won !");
        }
    }

    @Override
    public void gameInt() {
        System.out.println("Lets play a game, shall we? How about Rock Paper Scissors");
        String[] rps = {"r", "p", "s"};
        String compMove = rps[new Random().nextInt(rps.length)];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your move first : r, p or s");
        String plyrMove = sc.nextLine();
        System.out.println("Katthy's move = " + compMove);

        if(plyrMove.equals(compMove)){
            System.out.println("Its a Tie !");
        }

        else if (plyrMove.equals("r")) {
            if (compMove.equals("p")) {
                System.out.println("You lose!");

            } else if (compMove.equals("s")) {
                System.out.println("You win!");
            }
        }

        else if (plyrMove.equals("p")) {
            if (compMove.equals("r")) {
                System.out.println("You win!");

            } else if (compMove.equals("s")) {
                System.out.println("You lose!");
            }
        }

        else if (plyrMove.equals("s")) {
            if (compMove.equals("p")) {
                System.out.println("You win!");

            } else if (compMove.equals("r")) {
                System.out.println("You lose!");
            }
        }
        }

    @Override
    public void farewellInt() {
        System.out.println("Thank you for chatting with me !");
        System.out.println("Before you leave, would you like me to cheer you up ? Press y for Yes and n for No");
        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();

        if(ans.equals("y")){
        System.out.println("Why do Java programmers wear glasses?");
        System.out.println("Because they can't C#");
            System.out.println("Haha ! have a nice day!");
        }

        else{
            System.out.println("Bye-Bye! have a nice day!");
        }
    }


}
