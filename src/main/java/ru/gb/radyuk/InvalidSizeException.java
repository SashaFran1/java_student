package ru.gb.radyuk;

public class InvalidSizeException extends Exception {
    public InvalidSizeException() {
        super("Длина массива не совпадает с необходимой!!");
    }
}
