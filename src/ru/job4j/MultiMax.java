package ru.job4j;

public class MultiMax {
    public static int max(int first, int second, int third) {
        if (first >= second && first >= third) {
            return first;
        } else if (second >= first && second >= third) {
            return second;
        } else {
            return  third;
        }
    }
}
