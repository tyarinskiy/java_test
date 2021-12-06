package com.company;

public class Main {

    public static void main(String[] args) {
//        Computer comp = new Computer();
//        comp.i7.start();
//        comp.transent.start();
//        comp.i7.shutdown();
        new Computer(){
            void supervComp () {
                this.i7.start();
                this.transent.start();
            }
        }
    }
}
