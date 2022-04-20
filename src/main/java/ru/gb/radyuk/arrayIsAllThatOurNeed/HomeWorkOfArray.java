package ru.gb.radyuk.arrayIsAllThatOurNeed;

import java.util.Random;
import java.util.Scanner;

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
                array[i] *= 2;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[][] createMatrix(int size) {
        int[][] a = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                a[i][j] = (i == j) || (i + j == size - 1) ? 1 : 0;
            }
        }
        return a;
    }

    public static void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }

    private static int[] makeArrayOfValue(int len, int initialValue) {
        int[] arrayOfValue = new int[len];
        for (int i = 0; i < len; i++) {
            arrayOfValue[i] = initialValue;
        }
        return arrayOfValue;
    }

    private static void printArrayOfValue(int[] a) {
        for (int value : a) {
            System.out.print(value + " ");
        }
    }

    private static int[] returnArray() {
        int[] randomValue = new int[5];
        Random random = new Random();
        for (int i = 0; i < randomValue.length; i++) {
            randomValue[i] = random.nextInt(5);
        }
        return randomValue;
    }

    private static void minAndMaxOfArray(int[] arrayOfValue) {
        int min = 50, max = 0;
        for (int i = 0; i < arrayOfValue.length; i++) {
            if (arrayOfValue[i] < min) {
                min = arrayOfValue[i];
            } else if (arrayOfValue[i] > max) {
                max = arrayOfValue[i];
            }
        }
        System.out.println("Минимальный элемент = " + min);
        System.out.println("Максимальный элемент = " + max);
    }

    private static boolean equalsOrNot(int[] value) {
        for (int i = 0; i < value.length; i++) {
            int left = 0, right = 0, trash = i;
            while (trash >= 0) {
                left += value[trash];
                trash--;
            }
            trash = 1;
            while (value.length - trash > i) {
                right += value[value.length - trash];
                trash++;
            }
            if (left == right) {
                for (int a : value) {
                    System.out.print(a + " ");
                }
                return true;
            }
        }
        for (int a : value) {
            System.out.print(a + " ");
        }
        System.out.println();
        return false;
    }

    private static void spinner(int[] spinArray, int n) {

        if (n >= 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < spinArray.length; j++) {
                    int trash = spinArray[0];
                    spinArray[0] = spinArray[spinArray.length-1];
                    for (int k = 0; k < spinArray.length-1; k++) {

                    }
                }
            }
        }
        for (int a : spinArray) {
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
        converterOfOneAndZero();
        System.out.println();
        summonerOfValueForArray();
        System.out.println();
        multiplyToTwo();
        System.out.println();
        int[][] a = createMatrix(9);
        printMatrix(a);
        System.out.println();
        printArrayOfValue(makeArrayOfValue(10, 15));
        System.out.println();
        minAndMaxOfArray(returnArray());
        System.out.println();
        System.out.println(equalsOrNot(returnArray()));
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество перемещений");
        spinner(returnArray(),scanner.nextInt());
    }
}
