package com.company;

public class Student extends Person {
    //extends - unasleduet vse ot class Person
    int curse = 1;

    public Student (int h, String n, int curse) {
        super(h, n); // create shablon nasleduya shablon in Person h and n i dopolnyaem ego curse
        this.curse = curse;
    }

    void tell (){
        System.out.println(super.height); //super - tak obrash k var v nasleduemom klasse
        System.out.println(super.name);
        System.out.println(curse);  // super not need t.k. berem ego iz student
    }
}
