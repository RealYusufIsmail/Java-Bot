package com.yusuf;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Yusuf Bot.");
        System.out.println("I was created in 2021.");
        System.out.println("Please, remind me your name.");

        // reading a name
        String name = scanner.next();

        System.out.println("What a great name you have, " + name + "!");
        String jokeQuestion = "Would you like for me to say a joke";
        String answerSample = "Please reply with yes or no";
        System.out.println(jokeQuestion);
        System.out.println(answerSample);

        String Value = scanner.next();
        if (Value.equals("no")) {
            System.out.println("Well there might be a next time.");
        } else if((Value.equals("yes"))){
            System.out.println("Well i one said How is thy. People found it funny.");
            // yep
        };
        String goodBye = "Goodbye have a nice day";
        System.out.println(goodBye);




    }
}

