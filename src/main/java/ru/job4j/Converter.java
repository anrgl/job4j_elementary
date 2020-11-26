package ru.job4j;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int inRub = 140;
        int expectedEuro = 2;
        int outEuro = Converter.rubleToEuro(inRub);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are 2. Test result : " + passedEuro);

        inRub = 180;
        int expectedDollar = 3;
        int outDollar = Converter.rubleToDollar(inRub);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("140 rubles are 2. Test result : " + passedDollar);
    }
}
