package com.company;

import java.util.Scanner;

public class Me extends Gamer {
    private int myNumber;
    Scanner in = new Scanner(System.in);

    public Me (String myName){
        super(myName);
    }

    public void printInfo(){
        System.out.println("Мое имя: " + super.getMyName());
    }

    //get (){
//        System.out.println("Загадайте число от 1 до 20: ");
//        myNumber = in.nextInt();
//    }
//    public void print (){
//        System.out.println(myNumber);
//    }

}
