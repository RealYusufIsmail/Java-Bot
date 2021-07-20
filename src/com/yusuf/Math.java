package com.yusuf;

public class Math {
    public static void main(String[] args) {
        System.out.println(2 + (-3) + 5 + (-8));
        System.out.println ((9 * 10) * (20/5));
        System.out.println(-30 / 7);
        System.out.println(-10 * (3 + 4) / 2);
        int number = 12241;
        int digit = ((number % 100) / 10) % 10;
        System.out.println(digit);
        /*
        int a = -1;
        System.out.println(1 - a++);
        int n = 0;
        System.out.print(++n);
        System.out.print(n++);
        System.out.print(n++);
        int k = 3;
        System.out.print(++k);
        */
        int a = 300;
        int b = a++;
        int c = --b;
        System.out.println(c);
    }
}
