package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in); //create object with name str
        int first, second, sum;
        System.out.println("enter first: ");
        first = num.nextInt();
        System.out.println("enter second: ");
        second = num.nextInt();
        sum = (first + second);
        System.out.println("summ " + first + " + " + second + " equil " + sum);


    }
}
