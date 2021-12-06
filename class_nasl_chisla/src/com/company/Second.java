package com.company;

public class Second extends First {

    public void printNum (int val) {
        this.number = val;
        System.out.println("Значение равно " + super.number);
    }
}
