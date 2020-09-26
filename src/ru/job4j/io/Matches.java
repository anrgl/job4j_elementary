package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int matches = 11;
        while (matches > 0) {
            matches = userAction(matches, "Пользователь №1");
            if (isWin(matches)) {
                System.out.println("Пользователь №1 победил!");
                break;
            }

            matches = userAction(matches, "Пользователь №2");
            if (isWin(matches)) {
                System.out.println("Пользователь №2 победил!");
                break;
            }
        }
    }

    public static int userAction(int matches, String userName) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ход " + userName + ": ");
        int userInput = scanner.nextInt();
        while ((matches - userInput < 0) || (userInput < 1 || userInput > 3)) {
            System.out.println("Неправильный ввод. Цифра должна быть от 1 до 3.");
            System.out.println("Или вы пытаетесь взять больше спичек, чем есть на столе.");
            userInput = scanner.nextInt();
        }
        matches -= userInput;
        System.out.println(matches + " спичек на столе.");
        return matches;
    }

    public static boolean isWin(int matches) {
        return matches == 0;
    }
}
