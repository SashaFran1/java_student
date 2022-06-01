package ru.gb.radyuk;

public class InvalidDataException extends Exception {
    public InvalidDataException(int i, int j) {
        super("Ошибка данных в ячейке " + i + " - " + j);
    }
}


