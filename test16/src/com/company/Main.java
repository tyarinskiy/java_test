package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        okr(33, 20);
        float q = 33f, w = 21, z;
        z = q / w;
        System.out.println(z);                     // pravilniy sposob
        System.out.printf("%.0f", z);
    }

    public static void okr (float a, float b) {
        float rez, cel, ost;
        cel = (int)(a / b);
        rez = (a / b);
        ost = (rez % 1)*10;


        if (ost >= 5f) {
            cel = ++cel;
        } else cel = cel;
        System.out.println(a + " / " + b + " = " + cel);
//        System.out.println(cel);
//        System.out.println(ost);
//        System.out.println(rez);
    }
}
