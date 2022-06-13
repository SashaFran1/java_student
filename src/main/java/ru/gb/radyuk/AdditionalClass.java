package ru.gb.radyuk;

public class AdditionalClass {

    static final int SIZE = 10_000_000;
    static final int half = SIZE / 2;

    public void printer() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long currentTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                    Math.cos(0.4f + i / 2));
        }
        System.out.println("Время работы при вычислении в 1 потоке - " +
                (System.currentTimeMillis() - currentTime));
    }
}
