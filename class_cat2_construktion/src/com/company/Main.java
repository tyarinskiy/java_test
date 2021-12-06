package com.company;

public class Main {

    public static void main(String[] args) {
        Cat barsic = new Cat("Барсик", 5);
        System.out.println(barsic.name);
        System.out.println(barsic.age);

        Cat streetcat = new Cat();
        Cat streetcat1 = new Cat();

        System.out.println(streetcat.name);
        System.out.println(streetcat1.name);
        System.out.println(Cat.count);

    }
}
