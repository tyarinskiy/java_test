package com.company;

public class Main {

    public static void main(String[] args) {
        Plane S7 = new Plane();

        S7.A380.AddWeightWing();
        S7.B320.AddWeightWing();


        S7.B320.getWeightWing("B320");
        S7.A380.getWeightWing("A380");

    }
}
