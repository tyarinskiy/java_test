package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in); //create object with name str
        int number, sum = 0;
        System.out.println("enter num from 0 to 1000: ");
        number = num.nextInt();
        for (int i = 1; i < 4; i ++) {
            sum = sum + (number % 10);
         //   System.out.println(sum);
            number = number / 10;
        }
        System.out.println(sum);
    }
}
