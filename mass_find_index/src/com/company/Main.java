package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = {25, 67, 88, 99, 299, 1};
        System.out.println("enter number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("number " + n + " " + check(array, n));
        System.out.println("Index of " + n + " is " + find(array, n));
    }
    public static int find (int[] array, int t) {
        if (array == null) return -1;
        int len = array.length;
        for (int i = 0; i < len; i++) {
            if (array[i] == t) return i;

        }
        return -1;
    }

    public static String check (int[] array, int x) {
        int len = array.length;
            for (int i = 0; i < len; i++) {
                if (array[i] == x) {
                    //System.out.println("number " + x + " is present");
                    //break;
                    return "is present";
                }
            }
        return "is not present";

    }

}


