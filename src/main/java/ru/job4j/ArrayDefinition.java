package ru.job4j;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        System.out.println("Ages size " + ages.length);
        System.out.println("Surnames size " + surnames.length);
        System.out.println("Prices size " + prices.length);

        String[] names = new String[4];

        names[0] = "Petr Arsentev";
        names[1] = "Aynur Galimov";
        names[2] = "Ivan Ivanov";
        names[3] = "Svetlana Mironova";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
