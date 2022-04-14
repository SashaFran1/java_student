package ru.gb.radyuk.advanceTask;

public class TaskForFor {

    private static void oneSquare() {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || i == 5) {
                    System.out.print("*  ");
                }
                if (i != 0 && i != 5) {
                    if (j == 0 || j == 5) System.out.print("*  ");
                    else System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        oneSquare();
    }
}
