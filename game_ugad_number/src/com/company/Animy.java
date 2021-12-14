package com.company;

import java.util.Random;

public class Animy extends Gamer {
    static int animNumber;

    public Animy (String gamerName){
        super(gamerName);
    }

    public void printInf () {
        System.out.println(gamerName);
    }

    public static int GetAnyNum() {
        int first = 1, sec = 20;
        Random rand = new Random();
        animNumber = (int) first + rand.nextInt(sec - first + 1);
        return animNumber;
    }
}
