package com.company;

public class Main {

    public static void myPrint (String a, String b){
        System.out.println(a + " " + b);
    }
    public static void myPrint (int a, int b){
        System.out.println(a + "\n" + b);
    }
    public static void myPrint (int a, boolean b){
        System.out.println(a + " " + b);
    }
    public static void main(String[] args) {
        myPrint("hrun", "test");
        myPrint(45, 34);
        myPrint(33, true);
    }
}
