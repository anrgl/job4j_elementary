package ru.job4j.math;

public class MathAbsUsage {
    public static void main(String[] args) {
        int i = 10;
        int j = 3;
        int rsl = j - i;
        System.out.println("Разность чисел равна: " + rsl);
        int abs = Math.abs(rsl);
        System.out.println("Абсолютное значение разности чисел равно: " + abs);
    }
}
