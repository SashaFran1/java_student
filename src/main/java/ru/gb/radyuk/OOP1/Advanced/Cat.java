package ru.gb.radyuk.OOP1.Advanced;

public class Cat extends Animal{

    public Cat() {
        Animal.count++;
    }

    public void swim(int length) {
        if (length <= 0) {
            System.out.println("Спасибо, что спасли котика!!");
        } else {
            System.out.println("Кот не умеет плавать!!!");
        }
    }
    public void run(int length) {
        if (length > 200) {
            System.out.println("Котик не смог столько пробежать!");
        } else {
            System.out.println("Котик пробежал " + length + " метров!!!");
        }
    }
}
