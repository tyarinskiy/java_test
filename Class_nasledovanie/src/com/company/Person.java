package com.company;

public class Person {
    // function -metodi (inside)
// peremennie - polyya
    public int height = 180; // obyav var dostupn v drug classah
    public String name = "Default";

    public void say(String name) {
        System.out.println("Hello, " + name);
    }

    public Person() {
        // inache error if vity() - bez znacheniya beret znacheniya po umolchaniu
    }

    public Person(int h, String n) {
        height = h;
        name = n;
    }

    public Person(String n) {
        name = n;
    }
}
