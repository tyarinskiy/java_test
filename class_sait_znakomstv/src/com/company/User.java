package com.company;

public class User {
    String name;
    short age;
    int height;
    static int count = 0;

    public User(String name, short age, int height){
        this.name = name;
        this.age = age;
        this.height = height;
        count++;
    }
    public User(String name, int height, short age){
        this.name = name;
        this.age = age;
        this.height = height;
        count++;
    }
    public User(int height, String name, short age){
        this.name = name;
        this.age = age;
        this.height = height;
        count++;
    }
    public User(int height, short age, String name){
        this.name = name;
        this.age = age;
        this.height = height;
        count++;
    }
    public User( short age, int height, String name){
        this.name = name;
        this.age = age;
        this.height = height;
        count++;
    }
    public User( short age, String name, int height){
        this.name = name;
        this.age = age;
        this.height = height;
        count++;
    }
    void tell() {
        System.out.println(name + " возраст " + age + " рост " + height);
    }
}
