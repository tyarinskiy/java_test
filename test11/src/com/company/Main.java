package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int[] mass;
        int n;
        System.out.println("Enter number of array: ");
        n = num.nextInt();
        mass = new int[n];
        for (int i = 0; i < n; i ++) {
            System.out.println("Enter mass [" + i + "] = ");
            mass[i] = num.nextInt();
        }
        Arrays.sort(mass);
        System.out.println("the max element is: " + mass[n-1]);

//        int[] a = new int[] {-14, 23, 9, -4, 12, -1};
//        int max = 0;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] > max)
//                max = a[i];
//        }
//        System.out.println("Максимальный элемент: " + max);
    }
}
