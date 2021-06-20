package ru.job4j.math;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumAndDifAndDiv(double first, double second) {
        return sum(difference(first, second), division(first, second));
    }

    public static double sumOfAll(double first, double second) {
        return sum(sumAndDifAndDiv(first, second), sumAndDifAndDiv(first, second));
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumAndDifAndDiv(10, 20));
        System.out.println("Результат расчета равен: " + sumOfAll(10, 20));
    }
}
