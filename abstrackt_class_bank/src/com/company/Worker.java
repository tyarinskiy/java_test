package com.company;

public class Worker extends Human {
    private String bank;

    public Worker (String name, String surname, String NameBank){
        super(name, surname);
        this.bank = NameBank;
    }
    public void printInfo () {
        System.out.println("Имя: "  + super.getName() + ". Фамилия: " + super.getSurname() + ". Работает в банке: " + bank);
    }
}
