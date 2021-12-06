package com.company;

public class Main {

    public static void main(String[] args) {
        Person vitya = new Person(120, "Vitya"); //podkl class
        //vitya.height = 120; //zamena only for vity not vlad
        vitya.say("hui"); //metod say
        System.out.println(vitya.name + "'s height is " + vitya.height); //ispolzovali pole height
        Person vlad = new Person(); //podkl class
        System.out.println(vlad.height);
        //fori sout
        Person dima = new Person("Dima");
        System.out.println(dima.name);

        Student freshman = new Student(176, "viktor", 2);
        freshman.tell();
    }
}
