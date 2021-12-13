package com.company;

public class Summ {
    private static int allSum = 0;

    public void summ(int a, int b){
        System.out.println("Суммы: " + (a + b));
        allSum += (a + b);
        System.out.println("вся сумма: " + allSum);
    }
}
