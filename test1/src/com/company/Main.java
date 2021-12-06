package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in); //create obj with name str
        String name, sname;
        System.out.print("helo");
        System.out.print("\nname: ");
        name = str.next();
        //System.out.println(name);
        System.out.print("\nsname: ");
        sname = str.next();
        System.out.println("my name is " + name +" "+ sname);

    }
}
