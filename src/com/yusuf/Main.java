package com.yusuf;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Java Bot.");
        System.out.println("I was created in 2021.");
        System.out.println("Please, remind me your name.");

        // reading a name
        String name = scanner.next();

        System.out.println("What a great name you have, " + name + "!");

        System.out.println("I can do math. Want to see, " + name + "?");
        String yes = scanner.next();
        String no = scanner.next();

        String input = scanner.next();
        if (input.equalsIgnoreCase(yes)) {
         // do yes stuff
            System.out.println("test");
        } else if (input.equalsIgnoreCase(no)) {
            // do no stuff
            System.out.println("Oh well there is always a next time");
        } else {
            System.out.println("error");
        }


    }
}

