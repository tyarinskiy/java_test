package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        long first, second;
        int i = 0, ostatok = 0;
        int[] sum = new int[20];
        System.out.println("Enter first: ");
        first = num.nextLong();
        System.out.println("Enter second: ");
        second = num.nextLong();
        while (first != 0 || second != 0) {
            sum[i++] = (int)((first % 10 + second % 10) % 2);
            ostatok = (int)((first % 10 + second % 10) / 2);
            first = first / 10;
            second = second / 10;
        }
        if (ostatok != 0) {
            sum[i++] = ostatok;
        }
        --i;
        System.out.println("Sum of two numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }

//        System.out.println(1 / 2);

    }
}
