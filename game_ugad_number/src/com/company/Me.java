package com.company;

import java.util.Scanner;

public class Me extends Gamer {
    static int number;

    public Me (String gamerName){
        super(gamerName);
    }
    public static int GetNum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Загадайте число от 1 до 20: ");
        number = in.nextInt();
        return number;
    }


    public void printInf () {
        System.out.println(gamerName);
    }


}
