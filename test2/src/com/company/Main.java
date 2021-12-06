package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in); //create object with name str
        float far, cel;
        System.out.println("num far: ");
        far = num.nextFloat();
        cel = (far -32) * 5/9;
        System.out.println("num fcel: " + cel);

    }
}
