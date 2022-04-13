package ru.gb.radyuk.lessonMainConstructions;

import java.util.Scanner;

public class HomeWork2 {

    private static Scanner scanner = new Scanner(System.in);

    private static boolean checkIntervalTenToTwenty() {
        System.out.println("Последовательно введите два числа, необходимых для проверки");
        int a = scanner.nextInt(),b = scanner.nextInt();
        a = a + b;
        return a >= 10 && a <= 20;
    }

    private static boolean negativeOrNot(int a) {
        return a < 0;
    }

    private static void positivOrNot(int a) {
        if (a >= 0) System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
    }

    private static void repeatLine(String s, int a) {
        while (a>0)
        {
            System.out.println(s);
            a--;
        }
    }

    private static boolean leapYearOrNot() {
        System.out.println("Введите интересующийЮ для проверки год");
        int year = scanner.nextInt();
        return ((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0;
    }

    public static void main(String[] args) {
        System.out.println(checkIntervalTenToTwenty());
        System.out.println("Введите число для проверки на то положительное оно или нет");
        positivOrNot(scanner.nextInt());
        System.out.println("Введите число для проверки на то отрицательное оно или нет");
        System.out.println(negativeOrNot(scanner.nextInt()));
        System.out.println("Сначала введите строку, которую хотите повторить," +
                " после чего введить количество повторений");
        repeatLine(scanner.next(),scanner.nextInt());
        System.out.println(leapYearOrNot());
    }
}
