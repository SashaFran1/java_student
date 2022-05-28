package ru.gb.radyuk.unit2.lesson1.testPackage;

public class Treadmill {

    private final int length;
    public Treadmill(int length) {
        this.length = length;
    }
    public void humanJump(Human h) {
        h.run(length);
    }
    public void catJump(Cat c) {
        c.run(length);
    }
    public void robotJump(Robot r) {
        r.run(length);
    }
}
