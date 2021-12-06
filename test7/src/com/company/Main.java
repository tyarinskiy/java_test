package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second, third;
        System.out.println("Enter first: ");
        first = num.nextInt();
        System.out.println("Enter second: ");
        second = num.nextInt();
        System.out.println("Enter third: ");
        third = num.nextInt();
        if (first > second && first > third) {
            System.out.println("the biggesr is: " + first);
        } else if (first < second && third < second) {
            System.out.println("the biggest is: " + second);
        } else {
            System.out.println("the biggest is: " + third);
        }


    }
}
