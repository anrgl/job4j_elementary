package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstUser;
        int secondUser;
        int matches = 11;
        while (matches > 0) {
            System.out.print("Пользователь №1: ");
            firstUser = scanner.nextInt();
            if (firstUser < 1 || firstUser > 3) {
                System.out.println("Неправильный ввод. Цифра должна быть от 1 до 3.");
                System.out.print("Пользователь №2: ");
                firstUser = scanner.nextInt();
            } else if (matches - firstUser == 0) {
                System.out.println("Пользователь №1 победил!");
                break;
            } else if (matches - firstUser < 0) {
                System.out.println("Вы пытаетесь взять слишком много спичек. Попробуйте меньше.");
            }
            matches -= firstUser;
            System.out.println(matches + " спичек на столе.");

            System.out.print("Пользователь №2: ");
            secondUser = scanner.nextInt();
            if (secondUser < 1 || secondUser > 3) {
                System.out.println("Неправильный ввод. Цифра должна быть от 1 до 3.");
                System.out.print("Пользователь №2: ");
                secondUser = scanner.nextInt();
            } else if (matches - secondUser == 0) {
                System.out.println("Пользователь №2 победил!");
                break;
            } else if (matches - secondUser < 0) {
                System.out.println("Вы пытаетесь взять слишком много спичек. Попробуйте меньше.");
            }
            matches -= secondUser;
            System.out.println(matches + " спичек на столе.");
        }
    }
}
