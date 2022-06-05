package ru.gb.radyuk.unicWords;

import java.util.*;

public class UnicWords {

    final private static int LIST_SIZE = 20;

    public static void creatorArray() {
        ArrayList<String> trash = new ArrayList<>(20);
        Collections.addAll(trash);
        Random random = new Random();
        for (int j = 0; j < LIST_SIZE; j++) {
            StringBuilder stringBuilder = new StringBuilder();
            char code = (char) (random.nextInt(5) + 33);
            stringBuilder.append(code);
            trash.add(stringBuilder.toString());
            System.out.print(stringBuilder.toString() + " ");
        }
        System.out.println();
        HashMap<String, Integer> arrayWithoutDouble = new HashMap<>();
        for (int i = 0; i < LIST_SIZE; i++) {
            if (!arrayWithoutDouble.containsKey(trash.get(i))) {
                int count = Collections.frequency(trash, trash.get(i));
                arrayWithoutDouble.put(trash.get(i), count);
            }
        }
        for (Map.Entry<String, Integer> pair : arrayWithoutDouble.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
