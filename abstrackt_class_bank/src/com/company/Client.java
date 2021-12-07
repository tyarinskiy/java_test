package com.company;

public class Client extends Human {
    private String bank;

    public Client (String name, String surname, String namBank){
        super(name, surname);
        this.bank = namBank;
    }
    public void printInfo(){
        System.out.println("Имя: " + super.getName() + ". Фамилия: " + super.getSurname() + ". Клиент в банке: " + bank);
    }
}
