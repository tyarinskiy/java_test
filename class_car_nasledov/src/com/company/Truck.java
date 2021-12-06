package com.company;

import java.util.Scanner;

public class Truck extends Car{
    int numWhell = 8;
    int maxWheit = 7500;

    public Truck (int w, String m, char c, float s, int numWhell, int maxWheit){
        super(w, m, c, s);
        this.numWhell = numWhell;
        this.maxWheit = maxWheit;
    }
    public Truck (int w, String m, char c, float s, int numWhell){
        super(w, m, c, s);
        this.numWhell = numWhell;

    }
    public Truck (int w, String m, char c, float s){
        super(w, m, c, s);

    }
    public void outPutTrack (){
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
        System.out.println("Максимальная масса - " + maxWheit + ". " + "Количество колес: " + numWhell);
    }
    public void chengWh (int Wheell){
    //    Scanner in = new Scanner(System.in);
    //    System.out.println("Введите новое количество колес: ");
        numWhell = Wheell;
    }
}
