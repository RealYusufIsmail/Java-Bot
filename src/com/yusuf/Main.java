package com.yusuf;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //repeated strings
        String goodBye = "Goodbye have a nice day";
        String wrongAnswer = "You never provided a right answer.";
        String answerSample = "Please reply with yes or no";
        String ownerCredit = "This bot was made by Yusuf Arfan Ismail.";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Yusuf Bot.");
        System.out.println("I was created in 2021.");
        System.out.println("Please, remind me your first name.");

        // reading a name
        String name = scanner.next();

        System.out.println("What a great name you have, " + name + "!");
        String jokeQuestion = "Would you like for me to say a joke";
        System.out.println(jokeQuestion);
        System.out.println(answerSample);

        String Joke = scanner.next();
        if (Joke.equals("no")) {
            System.out.println("Well there might be a next time.");
        } else if ((Joke.equals("yes"))) {
            System.out.println("Well i one said How is thy. People found it funny.");
        } else {
            System.out.println(wrongAnswer);
        }


        System.out.println("Shall i do some math " + name);
        System.out.println(answerSample);
        String Math = scanner.next();
        if (Math.equals("no")) {
            System.out.println("Ok");
            System.out.println(goodBye);
        } else if((Math.equals("yes"))){
            System.out.println("I will do 10 * 10.");
            System.out.println(10 * 10);
        } else {
            System.out.println(wrongAnswer);
        };
        System.out.println("That's it for today.");
        System.out.println(ownerCredit);
    }
}

