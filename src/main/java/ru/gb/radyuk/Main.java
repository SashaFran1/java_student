package ru.gb.radyuk;

import ru.gb.radyuk.unicWords.*;
import static ru.gb.radyuk.unicWords.PhoneBook.*;

public class Main {
    public static void main(String[] args) {
        UnicWords.creatorArray();
        System.out.println();
        addPhoneNumber( "89996546999", "Сидоров");
        addPhoneNumber("89568741258", "Петров");
        addPhoneNumber("89568743258", "Петров");
        addPhoneNumber("89566284918", "Петров");
        addPhoneNumber( "89567354918", "Сидоров");
        addPhoneNumber("89112284918", "Иванов");
        findNumber("Петров");
    }
}
