package com.company;

import java.util.Random;

public class Animy extends Gamer{
    private int animyChose;
    private int first = 1, sec = 20;
    public void getAnimyChose (){
        Random rand = new Random();
        animyChose = (int) first + rand.nextInt(sec - first + 1);
    }
    public void print (){
        System.out.println(animyChose);
    }
}
