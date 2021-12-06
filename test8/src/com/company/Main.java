package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first;
        System.out.println("Enter number: ");
        first = num.nextInt();
        System.out.println("table for " + first);
        for (int i = 1; i <= 9; i ++){
            System.out.println(first + " * " + i + " = " + first * i);
        }

    }
}
