package ru.gb.radyuk.catAndPlate;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }
    public void addFood(int i) {
        if (i >= 0) {
            food += i;
        }
    }

    public void decreaseFood(int n) {
        food -= n;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
}

