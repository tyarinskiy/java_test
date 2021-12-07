package com.company;

public class Main {

    public static void main(String[] args) {
        Human client = new Client("Алексей", "Тярин", "Тинькофф");
        Human worker = new Worker("Ксения", "Киселева", "Сбер");

        worker.printInfo();
        client.printInfo();

    }
}
