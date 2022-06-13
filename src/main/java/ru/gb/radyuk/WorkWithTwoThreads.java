package ru.gb.radyuk;

import java.util.Arrays;

public class WorkWithTwoThreads {

    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;

    public void printerWithTwoThreads() {
        float[] arr = new float[SIZE];
        Arrays.fill(arr, 1.0f);
        long currentTime = System.currentTimeMillis();
        float[] subArrUpToHalf = new float[HALF];
        float[] subArrDownToHalf = new float[HALF];
        System.arraycopy(arr, 0, subArrUpToHalf, 0, subArrUpToHalf.length);
        System.arraycopy(arr, HALF, subArrDownToHalf, 0, subArrDownToHalf.length);
        long spendTime = System.currentTimeMillis() - currentTime;
        System.out.println("Время потраченное на разбивку в 2 массива - " + spendTime);
        currentTime = System.currentTimeMillis();
        Thread t0 = new Thread(() -> {
            for (int i = 0; i < HALF; i++) {
                subArrUpToHalf[i] = (float) (subArrUpToHalf[i] *
                        Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                        Math.cos(0.4f + i / 2));
            }
        });
        t0.start();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < HALF; i++) {
                subArrDownToHalf[i] = (float) (subArrDownToHalf[i] * Math.sin(0.2f + i / 5) *
                        Math.cos(0.2f + i / 5) *
                        Math.cos(0.4f + i / 2));
            }
        });
        t1.start();
        currentTime = System.currentTimeMillis() - currentTime;
        System.out.println("Время потраченное на вычисление в 2-х потоках - " + currentTime);
        spendTime += currentTime;
        currentTime = System.currentTimeMillis();
        System.arraycopy(subArrUpToHalf, 0, arr, 0, subArrUpToHalf.length);
        System.arraycopy(subArrDownToHalf, 0, arr, HALF, subArrDownToHalf.length);
        System.out.println("Время потраченное на склейку - "
                + (System.currentTimeMillis() - currentTime));
        spendTime += System.currentTimeMillis() - currentTime;
        System.out.println("Общее затраченное время на расчёт в двух потоках - " + spendTime);
    }
}