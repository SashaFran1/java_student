package ru.gb.radyuk;

public class Main {
    public static void main(String[] args) {
        AdditionalClass additionalClass = new AdditionalClass();
        additionalClass.printer();
        WorkWithTwoThreads workWithTwoThreads = new WorkWithTwoThreads();
        workWithTwoThreads.printerWithTwoThreads();
    }
}
