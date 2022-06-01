package ru.gb.radyuk;

import java.util.Arrays;
import java.util.Random;

public class Main {

    final static private int heightArray = 4;
    final static private int weightArray = 4;

    public static void main(String[] args) throws Exception {
        counter(creatorArray());
    }

    public static String[][] creatorArray() {
        String[][] mainArr = new String[heightArray][weightArray];
        Random random = new Random();
        for (int i = 0; i < heightArray; i++) {
            for (int j = 0; j < weightArray; j++) {
                StringBuilder stringBuilder = new StringBuilder();
                char code = (char) (random.nextInt(43) + 33);
                stringBuilder.append(code);
                mainArr[i][j] = stringBuilder.toString();
            }
        }
        for (int i = 0; i < heightArray; i++) {
            for (int j = 0; j < weightArray; j++) {
                System.out.print(mainArr[i][j] + "  ");
            }
            System.out.println();
        }
        return mainArr;
    }

    public static void counter(String[][] arr1) throws Exception {
        String[][] trashArr = new String[4][4];
        int height = arr1.length, weight = arr1[0].length;
        if (weight == 4 && height == 4) {
            System.out.println();
            System.out.println("Длины совпадают");
            System.out.println();
            String[] numbers = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",};
            int count = 0;
            for (int i = 0; i < heightArray; i++) {
                for (int j = 0; j < weightArray; j++) {
                    try {
                        if ((Arrays.asList(numbers).contains(arr1[i][j]))) {
                            count += Integer.parseInt(arr1[i][j]);
                        } else
                            throw new Exception("Ошибка данных в ячейке " + i + " - " + j);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
            System.out.println();
            System.out.println("Сумма всех чисел массива = " + count);
        } else {
            throw new Exception("ОШИБКА!!! Несовпадение размеров массива");
        }
    }
}



