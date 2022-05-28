package ru.gb.radyuk.unit2.lesson1.testPackage;

public class Cat implements Movement {

    private final int possibleToRun = 100;
    private final int possibleToJump = 2;
    private String name;
    private boolean ableToPass;

    @Override
    public void run(int length) {
        if (length >= 0) {
            if (possibleToRun >= length ) {
                System.out.println("Кот пробежал " + length);
                ableToPass = true;
            } else {
                System.out.println("Кот не смог пробежать " + length);
            }
        }
    }

    @Override
    public void jump(int length) {
        if (length >= 0 && ableToPass == true) {
            if (possibleToJump >= length ) {
                System.out.println("Кот прыгнул на " + length);
                ableToPass = true;
            } else {
                System.out.println("Кот не смог перепрыгнуть стену высотой " + length);
            }
        }
    }

}
