package com.company;

import java.util.Scanner;

public class Plane {
 //   private String airName;

    class wing {
        private int mass;
        public void AddWeightWing (){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter weight of wing");
            mass = in.nextInt();
        }
        void getWeightWing (String name){
            System.out.println("The weight of " + name + " is " + this.mass);
        }
    }
    wing A380 = new wing();
    wing B320 = new wing();

}

