package com.company;

import java.util.Scanner;

public class Gamer {

    Scanner in = new Scanner(System.in);
    protected String gamerName; //protected чтоб иметь доступ в классах наследниках
    protected int helth = 100;

    public Gamer(String gamerName){
        this.gamerName = gamerName;
    }

//    public Gamer(){}; // конструктор для getnum



//    public void printInf(){
//        System.out.println(this.gamerName);
//    }
//
//    public void test() {
//    }
}
