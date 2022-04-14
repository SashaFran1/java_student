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

    private static void oneSquareAndLine() {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || i == 5) {
                    System.out.print("*  ");
                }
                if (i != 0 && i != 5) {
                    if (j == 0 || j == 5 || i == j) System.out.print("*  ");
                    else System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }

    private static void triangle() {

        for (int i = 0; i < 6; i++) {
            for (int j = 5; j >= 0; j--) {
                if (i >= j) {
                    System.out.print("*  ");
                }
            }
            System.out.println("");
        }
    }

    private static void SquareInSquare() {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i < 2 || i >= 4) {
                    System.out.print("*  ");
                }
                if (!(i < 2) && !(i >= 4)) {
                    if (j < 2 || j >= 4) System.out.print("*  ");
                    else System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }

    private static void twoSquares() {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if((i <= 1 & j >= 4) || (i >= 4 && j <= 1)) {
                    System.out.print("   ");
                }
                else System.out.print("*  ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        oneSquare();
        System.out.println();
        oneSquareAndLine();
        System.out.println();
        triangle();
        System.out.println();
        SquareInSquare();
        System.out.println();
        twoSquares();
    }
}
