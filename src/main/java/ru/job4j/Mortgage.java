package ru.job4j;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double needPay = amount;
        while (needPay >= 0) {
            needPay = needPay + needPay * (percent / 100) - salary;
            year++;
        }
        return year;
    }
}
