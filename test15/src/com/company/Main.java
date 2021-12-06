package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        compare(100, 100);
    }
    public static void compare (int a, int b) {
        //Scanner in = new Scanner(System.in);
        //System.out.println("Enter number one: ");
        if (a != b && a > b) {
            System.out.println(" a != b \n a > b");
        } else if (a != b && a < b) {
            System.out.println(" a != b \n a < b");
        } else {
            System.out.println(" a = b ");
        }

    }
}
