package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int[] mass; //float[] mass = new float[] {23.23f, 34,34f,56,78f};
//        mass = new int[5]; // videlenie pamyzti pod mass 5 elementov
//        mass[0] = 23; //otchet s 0
//        mass[1] = 34;
//        mass[2] = 56;
//        // int[] mass = new int[] {23,34,56}; the same as 5 upper
//        System.out.println(mass[1]);
        Scanner in = new Scanner(System.in);
        int[] a;
        int n;
        System.out.println("Enter numbers of array: ");
        n = in.nextInt(); //vvod kolich elementov mass
        a = new  int [n]; //videl pamyat
        for (int i = 0; i < n; i ++){
            System.out.print("Enter a [" + i + "] = ");
            a[i] = in.nextInt();
           // vvodim s keyboard all elementi massiv
        }
        //lenght - return kollich elementov v mass
        System.out.println("dlinns massiv " + a.length); //opredel dlinu mass
        // Arrays.copyOF copy one in two
        int[] arr = new int[] {1,7,5,11,3};
        int[] some_new = Arrays.copyOf(arr, arr.length); //copy one in new

        for (int i = 0; i < 5; i ++) {
            System.out.println(some_new[i]);

        }
        //Arrays.sort -sort elementov in mass
        Arrays.sort(arr); //sortirovka
        for (int i = 0; i < 5; i ++) {
            System.out.println(arr[i]);

        }


    }
}
