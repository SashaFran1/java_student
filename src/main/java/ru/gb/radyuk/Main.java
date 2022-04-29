package ru.gb.radyuk;

import ru.gb.radyuk.OOP1.Advanced.Cat;
import ru.gb.radyuk.OOP1.Advanced.Dog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cat c1 = new Cat();
        Dog d1 = new Dog();
        System.out.println("Введите длинну для забега котика");
        c1.run(scanner.nextInt());
        System.out.println("Введите длинну для заплыва котика");
        c1.swim(scanner.nextInt());
        System.out.println("Введите длинну для забега бобика");
        d1.run(scanner.nextInt());
        System.out.println("Введите длинну для заплыва бобика");
        d1.swim(scanner.nextInt());
    }
}
