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
    }

    public static void main(String[] args) {
        converterOfOneAndZero();

    }
}
