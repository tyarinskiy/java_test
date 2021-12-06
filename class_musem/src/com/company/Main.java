package com.company;

import java.util.Scanner;

import static com.company.Artifact.count;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Artifact sword = new Artifact("Меч", 12788);
        Artifact goblet = new Artifact("кубок", 12789, "древний Рим");
        Artifact axe = new Artifact("Секира", 12790, "Русь", 10);

        System.out.println(sword.name + " номер " + sword.number + " Культура " + sword.calture + " Век " + sword.age);
        System.out.println(goblet.name + " номер " + goblet.number + " Культура " + goblet.calture + " Век " + goblet.age);
        System.out.println(axe.name + " номер " + axe.number + " Культура " + axe.calture + " Век " + axe.age);
        System.out.println("all " + count);

    }
}
