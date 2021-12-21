package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        int numMy;
        int aniNum;

        Me Iam = new Me("Alex");  //вввод имени с клавиатуры см. полиморфизм
        Animy animy = new Animy("angryЕnуmy");

//        System.out.println(Iam.helth);
//        System.out.println(animy.helth);

        numMy = Iam.GetNum();
        aniNum = animy.getAnimyNumber();

//        while (Iam.helth != 0 && animy.helth != 0){
//
//        }

        while ((aniNum != Iam.meNumber) && (numMy != animy.animNumber)){



//            System.out.println(numMy + " " + animy.animNumber + " " + aniNum + " " + Iam.meNumber); //для отладки
            animy.tryToKillMi(Iam);
            Iam.tryToKillAni(animy);
        }

    }
}
