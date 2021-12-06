package com.company;

import java.util.Scanner;

public class First {
    int number;

    public void getNumber (){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        number = in.nextInt();
    }
}
