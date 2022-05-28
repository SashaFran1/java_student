package ru.gb.radyuk;

import ru.gb.radyuk.unit2.lesson1.testPackage.Cat;
import ru.gb.radyuk.unit2.lesson1.testPackage.Human;
import ru.gb.radyuk.unit2.lesson1.testPackage.Movement;
import ru.gb.radyuk.unit2.lesson1.testPackage.Robot;

public class Main {
    public static void main(String[] args) {

        Movement[] participants = new  Movement[6];
        participants[0] = new Robot();
        participants[1] = new Robot();
        participants[2] = new Cat();
        participants[3] = new Cat();
        participants[4] = new Human();
        participants[5] = new Human();

        for (int i = 0; i < participants.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Участник № " + (i+1));
                participants[i].run(1000);
                participants[i].jump(1);
            } else {
                System.out.println("Участник № " + (i+1));
                participants[i].run(20);
                participants[i].jump(3);
            }
        }
    }
}
