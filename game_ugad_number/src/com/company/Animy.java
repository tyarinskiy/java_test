package com.company;

import java.util.Random;

public class Animy extends Gamer {
    protected int animNumber;
    protected int first = 1, sec = 20;

    public Animy (String gamerName){
        super(gamerName);
    }

    public int GetAnyNum(Me man) {
        Random rand = new Random();
        animNumber = (int) first + rand.nextInt(sec - first + 1);
        if (animNumber == man.number) {
            System.out.println("Попал нах!!!");
        } else if (animNumber > man.number){
            System.out.println("Мимо, Число чела меньше!");
            sec = animNumber;
        } else {
            System.out.println("Мимо, число чела больше!");
            first = animNumber;
        }
        return this.animNumber;
    }
}
