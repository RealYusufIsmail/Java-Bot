package com.yusuf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Whats is your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Hello, " + name + "!");

    }
}
