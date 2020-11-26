package ru.job4j.oop;

public class Surgeon extends Doctor {
    private int level;

    public int getLevel() {
        return level;
    }

    public void cut() {
        System.out.println("Cut cut cut...");
    }
}
