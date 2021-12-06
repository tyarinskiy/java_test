package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        long min, year, day;
        System.out.println("Enter number of minutes: ");
        min = num.nextLong();
        day = (min/60)/24;
        year = day/365;
        System.out.println(min + " minutes are " + day + " days" + "\n and " + year + " years");

    }
}
