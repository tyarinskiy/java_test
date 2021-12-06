package com.company;

public class Main {

    public static void main(String[] args) {
        char[][] array = new char[3][3];
//        for (int i = 0; i < array.length; i ++) //esli budet oshibka videl pamyzt tak
//            array[i] = new char[3];
        array[0][0] = 'C';
        System.out.println(array[0][0]);
        int[][] mass = new int[][] {{0, 34, 2}, {3, 4, 5}};
        System.out.println(mass[1][2]);




    }
}
