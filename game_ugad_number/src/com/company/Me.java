package com.company;


public class Me extends Gamer {
    int test = 55555;
    public int number;
    public Me (String gamerName){
        super(gamerName); // для доступа к основному классу (переменной)
    }

//    public Me() {
//        super();                 //конструктор для  getnum
//    }

    public int GetNum() {
        int number;
        System.out.println("Загадайте число от 1 до 20: ");
        number = this.in.nextInt();
        return number;
    }

//        public void printMyName(){
//        System.out.println(gamerName);
//    }
 //   public void printInf () {
 //       System.out.println(gamerName);
 //   }


}
