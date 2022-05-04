package ru.gb.radyuk.advanceTask;

import java.util.Random;
import java.util.Scanner;

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
            System.out.println();
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
            System.out.println();
        }
    }

    private static void triangle() {

        for (int i = 0; i < 6; i++) {
            for (int j = 5; j >= 0; j--) {
                if (i >= j) {
                    System.out.print("*  ");
                }
            }
            System.out.println();
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
            System.out.println();
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
            System.out.println();
        }
    }

    private static void sort(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j+1]) {
                    int trash = a[j];
                    a[j] = a[j+1];
                    a[j+1] = trash;
                }
            }
        }
        for (int number: a ) {
            System.out.print(number + "  ");
        }
    }

    private static int[] createArray() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите длину массива");
        int[] a = new int[scanner.nextInt()];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(8);
        }
        return a;
    }

    private static void randomPrintWithWeight(int[] arrayNumbers, int[] arrayWeight) {
        int count = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            count += arrayWeight[i];
        }
        int[] arrayWithWeight = new int[count];
        int index = 0;
        for (int i = 0; index < arrayWithWeight.length - 1; i++) {
            int j = 0;
            while (j < arrayWeight[i]) {
                arrayWithWeight[index] = arrayNumbers[i];
                j++;
                index++;
            }
        }
        int random = (int) (Math.random() * ( arrayWithWeight.length - 1));
        System.out.println(arrayWithWeight[random]);
    }

    public static void main(String[] args) {
//        oneSquare();
//        System.out.println();
//        oneSquareAndLine();
//        System.out.println();
//        triangle();
//        System.out.println();
//        SquareInSquare();
//        System.out.println();
//        twoSquares();
//        System.out.println();
//        sort(createArray());
        System.out.println();
        randomPrintWithWeight(createArray(),createArray());
    }
}
