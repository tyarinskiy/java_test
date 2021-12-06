package com.company;

import static com.company.cat.count;

public class Main {

    public static void main(String[] args) {
        cat barsic = new cat();
        barsic.age = 4;
        barsic.name = "Барсик";
        count++;
        barsic.junmp();

        cat sharic = new cat();
        sharic.age = 8;
        sharic.name = "Шарик";
        count++;
        sharic.sayMow();

        System.out.println("Кот по имени " + barsic.name + " внесен в бвзу. Его возраст: " + barsic.age);
        System.out.println("Кот по имени " + sharic.name + " внесен в бвзу. Его возраст: " + sharic.age);

        System.out.println("Всего котов: " + count); //cat.count -иногда не можем зарезолвить



    }
}
