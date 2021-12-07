package com.company;

public class Main {

    public static void main(String[] args) {
	    Shape circle = new Circle();
        circle.draw();
    } //
    //бстрактный класс ничего не реализует. Внутри него можно лишь указать все методы и поля,
    // которые необходимо реализовывать во всех классах наследниках.
}
