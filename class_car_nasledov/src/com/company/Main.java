package com.company;

public class Main {

    public static void main(String[] args) {
	    Car bmw = new Car(1400, "bmv", (char) 36, 320);
        Car skoda = new Car(1800, "skoda", (char) 169, 280);

        Truck big = new Truck(5000, "scania", (char) 67, 180, 8, 7000);
        Truck big2 = new Truck(5000, "scania", (char) 67, 180);

        bmw.outPut();
        skoda.outPut();
        big.outPutTrack();

        big2.chengWh(7);
        big2.outPutTrack();



    }
}
