package ru.gb.radyuk.arrayIsAllThatOurNeed;

import java.util.Random;

public class HomeWorkOfArray {

    private static void converterOfOneAndZero() {
        int[] zeroAndOne = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            zeroAndOne[i] = rand.nextInt(2);
            System.out.print(zeroAndOne[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < zeroAndOne.length; i++) {
            if (zeroAndOne[i] == 1) {
                zeroAndOne[i] = 0;
            } else {
                zeroAndOne[i] = 1;
            }
            System.out.print(zeroAndOne[i] + " ");
        }
        System.out.println();
    }

    private static void summonerOfValueForArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void multiplyToTwo() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *=2;
            }
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        converterOfOneAndZero();
        System.out.println();
        summonerOfValueForArray();
        System.out.println();
        multiplyToTwo();
    }
}
