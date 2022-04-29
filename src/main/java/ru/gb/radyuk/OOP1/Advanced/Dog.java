package ru.gb.radyuk.OOP1.Advanced;

public class Dog extends Animal {

    public Dog(){
        Animal.count++;
    }

    public void swim(int length) {
        if (length > 10) {
            System.out.println("Шарик не смог столько проплыть!");
        } else {
            System.out.println("Шарик проплыл " + length + " метров!!!");
        }
    }

    public void run(int length) {
        if (length > 500) {
            System.out.println("Шарик не смог столько пробежать!");
        } else {
            System.out.println("Шарик пробежал " + length + " метров!!!");
        }
    }
}
