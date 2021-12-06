package com.company;

import java.util.Scanner;

public class Age {
    short age;
    Scanner in = new Scanner(System.in);
    public void getData () {
        System.out.println("Enter age of user: ");
        age = in.nextShort();

    }
}
