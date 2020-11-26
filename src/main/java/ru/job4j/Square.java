package ru.job4j;

public class Square {
    public static int[] calculate(int bound) {
        int[] squares = new int[bound];
        for (int i = 0; i < squares.length; i++) {
            squares[i] = i * i;
        }
        return squares;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
