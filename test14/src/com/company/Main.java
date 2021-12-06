package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner bum = new Scanner(System.in);
        int num, kol = 0, num2, i;
        System.out.println("Enter number: ");
        num = bum.nextInt();
        num2 = num;
        while (num2 != 0) {
            num2 = num2 / 10;
            kol += 1;
        }
        int[] array = new int[kol];
        i = array.length;
        while (num != 0) {
            array[i - 1] = num % 10;
            --i;
            num = num / 10;

        }
    //    System.out.print(array[array.length - 1]);
        System.out.println("razbivka: \n");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + ", ");
        }

    }
}

