package ru.gb.radyuk.unit2.lesson1.testPackage;

public class Wall {
    private int height;
    public Wall(int height) {
        this.height = height;
    }
    public void humanJump(Human h) {
        h.jump(height);
    }
    public void catJump(Cat c) {
        c.jump(height);
    }
    public void robotJump(Robot r) {
        r.jump(height);
    }
}
