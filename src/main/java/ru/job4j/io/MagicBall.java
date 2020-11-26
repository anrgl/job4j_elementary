package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    private final static String[] ANSWERS = {"Да", "Нет", "Может быть"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String question = scanner.nextLine();
        System.out.println(question);

        int rnd = new Random().nextInt(3);
        String answer = ANSWERS[rnd];
        System.out.println(answer);
    }
}
