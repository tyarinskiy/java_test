package com.company;

import java.util.Random;

public class Animy extends Gamer {
    protected int animNumber, secretNum; //secretNum - число загаданное врагом
    protected int first = 1, sec = 20;

    public Animy (String gamerName){
        super(gamerName);
    }

    public int getAnimyNumber(){
        Random rand = new Random();
        secretNum = (int) 1 + rand.nextInt(20 - 1 + 1);
        return secretNum;
    }

    public int tryToKillMi(Me man) {
        Random rand = new Random();
        animNumber = (int) first + rand.nextInt(sec - first + 1);
        System.out.println("Ход " + super.gamerName + " Мой выбор: " + animNumber);
        if (animNumber == man.number) {
            System.out.println(super.gamerName + " попал угадал число!!! Вы проиграли!");
        } else if (animNumber > man.number){
            System.out.println(super.gamerName + " промахнулся, число " + man.gamerName + " меньше!");
            sec = animNumber - 1;
        } else {
            System.out.println("Мимо, число чела больше!");
            first = animNumber + 1;
        }
        return this.animNumber;
    }
}
