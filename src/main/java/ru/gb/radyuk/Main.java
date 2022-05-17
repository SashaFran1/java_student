package ru.gb.radyuk;

import ru.gb.radyuk.catAndPlate.Cat;
import ru.gb.radyuk.catAndPlate.Plate;

public class Main {
    public static void main(String[] args) {
        Cat[] cat =
                {
                        new Cat("Barsik1", 25),
                        new Cat("Barsik2", 25),
                        new Cat("Barsik3", 25),
                        new Cat("Barsik4", 25),
                        new Cat("Barsik5", 25),
                        new Cat("Barsik6", 25),
                        new Cat("Barsik7", 25),
                };
        Plate plate = new Plate(100);
        plate.info();
        for (Cat c : cat) {
            if (plate.getFood() <= c.getAppetite()) {
                System.out.println("В кормушке мало еды, нужно добавить!");
                plate.addFood(50);
            }
            c.eat(plate);
            plate.info();
            c.isSatiety();
        }
    }
}
