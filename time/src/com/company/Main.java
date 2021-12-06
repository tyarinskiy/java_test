package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());
//        Date date =new Date();
//        System.out.println(date.toString());
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd ' и время' hh:mm:ss a zzz");
        System.out.println("Текущая дата " + formatForDateNow.format(dateNow));
    }
}
