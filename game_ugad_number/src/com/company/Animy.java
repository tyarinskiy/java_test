package com.company;

import java.util.Random;

public class Animy extends Gamer {
    protected int animNumber;
    protected static int first = 1, sec = 20;

    public Animy (String gamerName){
        super(gamerName);
    }

    public int GetAnyNum() {
        Random rand = new Random();
        animNumber = (int) first + rand.nextInt(sec - first + 1);
//        if (animNumber)

        return this.animNumber;

    }

//    public int tryToKill(){

 //   }

    //    public void Animy(int first, int sec) {
//        this.first = first;
//        this.sec = sec;
//    }

//    public void printInf () {
//        System.out.println(gamerName);
//    }

//
//    void testin(Me huy){
//        System.out.println(huy.test);
//    }

//    public static void tryToKill(int first, int sec){
//        int num;
//        Random rand = new Random();
//        num = (int) first + rand.nextInt(sec - first + 1);
//        System.out.println("Мое число: " + num);
//        if (num == Me.)
//    }
}
