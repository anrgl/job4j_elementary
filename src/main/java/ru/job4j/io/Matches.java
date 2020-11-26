package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        String username;
        boolean player = true;
        int matches = 11;
        while (matches > 0) {
            username = player ? "Пользователь №1" : "Пользователь №2";
            matches = userAction(matches, username);
            if (isWin(matches)) {
                System.out.println(username + " победил!");
                break;
            }
            player = !player;
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
