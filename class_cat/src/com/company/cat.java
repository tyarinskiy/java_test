package com.company;

public class cat {
    String name;
    int age;
    static int count = 0; //create static var. она общая т.к. не принадлежит каким-то определенным котам (переменная класса)

    public void sayMow() {
        System.out.println("Мяу!!!");
    }

    public void junmp() {
        System.out.println("Прыг");
    }

}

