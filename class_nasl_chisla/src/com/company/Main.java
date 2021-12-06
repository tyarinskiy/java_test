package com.company;

public class Main {

    public static void main(String[] args) {
        First firstNum  = new First();
        firstNum.getNumber();

        Second secNum = new Second();
        secNum.printNum(firstNum.number);
    }
}
