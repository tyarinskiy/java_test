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
        int numMy;

        Me Iam = new Me("apossum");  //вввод имени с клавиатуры см. полиморфизм
        Animy animy = new Animy("angryHui");

        numMy = Iam.GetNum();
        System.out.println(animy.GetAnyNum());



//        System.out.println(Animy.GetAnyNum());


    }
}
