package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in); //create object with name str
        int first;
        System.out.println("enter first num: ");
        first = num.nextInt();
        if (first > 0) {
            System.out.println("num is +");
        } else if (first < 0) {
            System.out.println("num is -");
        } else {
            System.out.println("num is 0");
        }

    }
}
