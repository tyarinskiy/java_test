package com.company;

public class Main { //public final class - не может быть наследников
    // если final в методе то мы не можем переопределять этот метод

    public static void main(String[] args) {
        final int a = 10; // создает константу
	    int x = Math.Summ(12, 13);
        System.out.println(x); //не нужно создавать new экземпляра (объекта)

//        int y = Math.mult(12, 13);
//        System.out.println(y);
//        не катит т.к. у mult нет static/ необходимо создать новый объект
        Math.x = 24; //меняем без создания объекта
        // static меняет переменную для всего класса, а не для конкретного экземпляра
    }

    public

}
