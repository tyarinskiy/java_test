package com.company;


public class Me extends Gamer {
    protected int meNumber;
    protected int number;
    public Me (String gamerName){
        super(gamerName); // для доступа к основному классу (переменной)
    }

    public int GetNum() {
        System.out.println("Загадайте число от 1 до 20: ");
        number = this.in.nextInt();
        return number;
    }

    public int tryToKillAni(Animy ani){
        System.out.println("Попробуй угадать число врага, выбери цифру от 1 до 20: ");
        meNumber = this.in.nextInt();
        if (meNumber == ani.secretNum) {
            System.out.println("Капец тебе враг! точное попадание!");
        }else if (meNumber > ani.secretNum){
            System.out.println("Ты не угадал, число врага меньше");
        }else {
            System.out.println("Ты не угадал, число врага больше");
        }
        return meNumber;
    }


}
