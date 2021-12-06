package com.company;

public class Cat {
    String name;
    int age;
    static int count = 0;
    // constract
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Cat(){
        this.name = "Уличный кот номер " + count++;
        //для ултчных котов без имени и без возраста иначе ошибка
    }
}

