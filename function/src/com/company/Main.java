package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int temp = func (3, 4);
//        System.out.println(temp);
        func (3, 4);
        read();


    }
//    //void // function kototaya nichego ne vozvrashaet
//    public static int func (int a, int b) {
//    //v skobkah nj chto prinimaet funck public static chtob func was vidna
//        int result = 1;
//        for (int i = 0; i < b; i++) {
//            result *=a;
//          }
//        return result; // to chto vernet funck
//    }
    public static int[] read () {
        int[] arr;
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        System.out.print("our array : {");
        for (int j = 0; j < n; j++)
            System.out.print(arr[j] + ", ");
        System.out.print("}");
        return arr;
    }
    public static void func (int a, int b) {
        //v skobkah nj chto prinimaet funck public static chtob func was vidna
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        System.out.println(result);
     }
///

}
