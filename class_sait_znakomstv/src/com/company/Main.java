package com.company;

public class Main {

    public static void main(String[] args) {
        User Vlad = new User("Влад", (short) 34, 182);
        User Sanya = new User(165, "Александр", (short) 21);
        User Ruslan = new User((short) 55, 190, "Руслан");

        System.out.println("в базе " + User.count + " пользователя");
//        System.out.println("1 " + Vlad.name + " возраст " + Vlad.age + " рост " + Vlad.height);
//        System.out.println("2 " + Sanya.name + " возраст " + Sanya.age + " рост " + Sanya.height);
//        System.out.println("3 " + Ruslan.name + " возраст " + Ruslan.age + " рост " + Ruslan.height);
        Vlad.tell();
        Sanya.tell();
        Ruslan.tell();
    }
}
