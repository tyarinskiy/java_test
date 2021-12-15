package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {
//    public static int getMyNumber () {
//        int myNumber;
//        Scanner in = new Scanner(System.in);
//        System.out.println("загадайте число от 1 до 20: ");
//        myNumber = in.nextInt();
////        System.out.println(myNumber);
//        return myNumber;
//    }

    public static void main(String[] args) {


        Gamer mynam = new Me("apossum");  //вввод имени с клавиатуры см. полиморфизм

 //        mynam.printInf();
        mynam.printInf();

        Gamer animy = new Animy("angryHui");
//        animy.printInf();
        animy.printInf();

        System.out.println(Me.GetNum());
        System.out.println(Animy.GetAnyNum());
    }
}
