package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int leng, sum = 0;
        int[] array;
        System.out.println("Enter leng of array: ");
        leng = num.nextInt();
        array = new int[leng];
        for (int i = 0; i < leng; i ++) {
            System.out.println("Enter array[" + i + "] = ");
            array[i] = num.nextInt();
        }

        for (int i = 0; i < array.length; i ++) {
            System.out.print(array[i] + " ");
            sum = sum + array[i];
        }
        System.out.println("\nSumm all numbers of array = " + sum);

    }
}
