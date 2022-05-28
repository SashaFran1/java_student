package ru.gb.radyuk.unit2.lesson1.testPackage;

public class Robot implements Movement{

    private final int possibleToRun = 10000;
    private final int possibleToJump = 0;
    private String name;

    private boolean ableToPass;

    @Override
    public void run(int length) {
        if (length >= 0) {
            if (possibleToRun >= length) {
                System.out.println("Робот пробежал " + length);
                ableToPass = true;
            } else {
                System.out.println("Робот не смог пробежать " + length);
            }
        }
    }

    @Override
    public void jump(int length) {
        if (length >= 0 && ableToPass) {
            if (possibleToJump >= length) {
                System.out.println("Робот прыгнул на " + length);
            } else {
                System.out.println("Робот не смог перепрыгнуть стену высотой " + length);
            }
        }
    }
}
