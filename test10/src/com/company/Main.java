package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        String[] days = new String[] {"monday", "tuesday", "Wednesday", "thursday", "friday", "saturday", "sunday"};
        int number;
        System.out.println("Enter number from 1 to 7: ");
        number = num.nextInt();
        System.out.println("the day is " + days[number - 1]);
//        switch (number) {
//            case 1:
//                System.out.println("the day is monday");
//                break;
//            case 2:
//                System.out.println("the day is tuesday");
//                break;
//            case 3:
//                System.out.println("the day is Wednesday");
//                break;
//            case 4:
//                System.out.println("the day is thursday");
//                break;
//            case 5:
//                System.out.println("the day is friday");
//                break;
//            case 6:
//                System.out.println("the day is saturday");
//                break;
//            case 7:
//                System.out.println("the day is sunday");
//                break;
//        }

    }
}
