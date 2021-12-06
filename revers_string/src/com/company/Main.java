package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        revers_str();
        get_index();
    }
    public static void revers_str () {
        System.out.println("Enter your string: ");
        Scanner in = new Scanner(System.in);
        char[] mass =  in.nextLine().toCharArray(); // perevod v char i zagon v mass
        for (int i = (mass.length - 1); i >= 0; i--) {
            System.out.print(mass[i] + " ");
        }
    }
    public static void get_index () {
        System.out.println("Enter your string: ");
        Scanner in = new Scanner(System.in);
        char[] mass = in.nextLine().toCharArray();
        System.out.println("Enter index what you wont: ");
        int index = in.nextInt();
        if (mass.length >= index){
            System.out.println("symbol with index " + index + " is " + mass[index]);
        } else System.out.println("your index out of range");

    }
}
