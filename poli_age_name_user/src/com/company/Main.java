package com.company;

public class Main {

    public static void main(String[] args) {
        Name test = new Name();
        test.getData();
        Age test1 = new Age();
        test1.getData();

        System.out.println(test.name + "    " + test1.age);

    }
}
