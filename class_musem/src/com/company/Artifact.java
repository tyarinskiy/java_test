package com.company;

public class Artifact {
    int number, age;
    String calture, name;
    static int count = 0;

    public Artifact(String name, int number) {
        this.name = name;
        this.number = number;
        this.calture = "Unknown";
        this.age = 0;
        count++;

    }
    public Artifact(String name, int number, String calture) {
        this.name = name;
        this.number = number;
        this.calture = calture;
        this.age = 0;
        count++;
    }
    public  Artifact(String name, int number, String calture, int age){
        this.name = name;
        this.number = number;
        this.calture = calture;
        this.age = age;
        count++;
    }

    public void printAll() {

    }

}
