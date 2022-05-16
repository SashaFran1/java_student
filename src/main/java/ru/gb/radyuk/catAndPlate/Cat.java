package ru.gb.radyuk.catAndPlate;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public void isSatiety() {
        if (satiety) {
            System.out.println(name + " сыт");
        } else {
            System.out.println(name + " всё еще хочет кушать");
        }
    }

    public int getAppetite() {
        return appetite;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (appetite <= p.getFood()) {
            p.decreaseFood(appetite);
            satiety = true;
        } else {
            System.out.println("Котику нужно больше еды!!");
        }
    }
}

