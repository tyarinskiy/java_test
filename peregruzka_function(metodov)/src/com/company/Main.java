package com.company;

public class Main {
    public static int sum (int a, int b){
        return a + b;
    }
    public static int sum (int a, int b, int c){
        return a + b + c;
    }
    public static float sum (float a, float b, float c){
        return a + b + c;
    }
    public static void main(String[] args) {
        System.out.println(sum(23, 76));
        System.out.println(sum(23, 76,10));
        System.out.println(sum(23.76f, 56.98f, 56.34f));
	    }
}
