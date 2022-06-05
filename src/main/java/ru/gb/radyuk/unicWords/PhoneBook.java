package ru.gb.radyuk.unicWords;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private static HashMap<String, String> phoneBook = new HashMap<>();

    public static void addPhoneNumber(String number, String lastName) {
        phoneBook.put(number, lastName);
    }

    public static void findNumber(String lastName) {
        for (Map.Entry<String, String> pair : phoneBook.entrySet()) {
            if (pair.getValue().equals(lastName)) {
                System.out.println(lastName + " - " + pair.getKey());
            }
        }
    }

}
