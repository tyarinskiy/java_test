package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        int numMy;

        Me Iam = new Me("apossum");  //вввод имени с клавиатуры см. полиморфизм
        Animy animy = new Animy("angryHui");

        numMy = Iam.GetNum();

        animy.GetAnyNum(Iam);
//        System.out.println(animy.first + "   " + animy.sec);
//        System.out.println(Animy.GetAnyNum());


    }
}
