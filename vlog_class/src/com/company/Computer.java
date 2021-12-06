package com.company;

public class Computer {
    class Proccessor {
        private boolean isStart = false;
        public void start () {
            isStart = true;
            System.out.println("isStart = " + isStart);
        }
        public void  shutdown () {
            isStart = false;
            System.out.println("isStart = " + isStart);
        }
    }
    class RAM {
        private boolean isStart = false;
        public void start () {
            isStart = true;
        }
        public void  shutdown () {
            isStart = false;
        }
    }
    Proccessor i7 = new Proccessor();
    RAM transent = new RAM();


}
