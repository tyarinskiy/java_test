package com.company;


public class Me extends Gamer {
    int test = 55555;
    public int number;
    public Me (String gamerName){
        super(gamerName); // для доступа к основному классу (переменной)
    }

    public int GetNum() {
        System.out.println("Загадайте число от 1 до 20: ");
        number = this.in.nextInt();
        return number;
    }

}
