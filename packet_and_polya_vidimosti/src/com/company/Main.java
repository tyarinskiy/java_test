package com.company; //пакетная область, любая комп по ней ищет все связующие компоненты проекта

public class Main {

    int x = 0;

    public static void main(String[] args) {
        //System.out.println(x); // не видит т.к. вне нашего метода
        System.out.println(this.x); //видит, т.к. this - ищет вне, в классе
    }
}
