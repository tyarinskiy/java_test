package com.company;

import java.util.Random;
import java.util.Scanner;

public class Animy extends Gamer {
    private int animyNumber;
    Scanner in = new Scanner(System.in);

    public Animy(String animyName) {
        super(animyName);
    }

//    public void printInfo(){
//        System.out.println("Animy name: " + super.getAnimyName());
//    }
}


    //    private int animyChose;
//    private int first = 1, sec = 20;
//    public void getAnimyChose (){
//        Random rand = new Random();
//        animyChose = (int) first + rand.nextInt(sec - first + 1);
//    }
//    public void print (){
//        System.out.println(animyChose);
//    }

