package com.company;

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

        System.out.println(Me.GetNum());
        System.out.println(Animy.GetAnyNum());

        Gamer mynam = new Me("apossum");
        mynam.printInf();

        Gamer animy = new Animy("angryHui");
        animy.printInf();

    }
}
