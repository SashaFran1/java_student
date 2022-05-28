package ru.gb.radyuk.unit2.lesson1.testPackage;

public class Human implements Movement {

    private final int possibleToRun = 500;
    private final int possibleToJump = 3;
    private String name;
    private boolean ableToPass;

    @Override
    public void run(int length) {
        if (length >= 0) {
            if (possibleToRun >= length) {
                System.out.println("Человек пробежал " + length);
                ableToPass = true;
            } else {
                System.out.println("Человек не смог пробежать " + length);
            }
        }
    }

    @Override
    public void jump(int length) {
        if (length >= 0 && ableToPass) {
            if (possibleToJump >= length) {
                System.out.println("Человек прыгнул на " + length);
            } else {
                System.out.println("Человек не смог перепрыгнуть стену высотой " + length);
            }
            ableToPass = true;
        }
    }

}
