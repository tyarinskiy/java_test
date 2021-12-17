package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        int numMy;
        int aniNum;

        Me Iam = new Me("apossum");  //вввод имени с клавиатуры см. полиморфизм
        Animy animy = new Animy("angryHui");

        numMy = Iam.GetNum();
        aniNum = animy.getAnimyNumber();

        while ((aniNum != Iam.meNumber) && (numMy != animy.animNumber)){

            System.out.println(numMy + " " + animy.animNumber + " " + aniNum + " " + Iam.meNumber);
            animy.tryToKillMi(Iam);
            Iam.tryToKillAni(animy);
        }

    }
}
