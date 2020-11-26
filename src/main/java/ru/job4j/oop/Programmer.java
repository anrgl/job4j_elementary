package ru.job4j.oop;

public class Programmer extends Engineer {
    private String favoriteDevLanguage;
    private int yearExp;

    public String getFavoriteDevLanguage() {
        return favoriteDevLanguage;
    }

    public int getYearExp() {
        return yearExp;
    }

    public void code() {
        System.out.println("public class HelloWorld {...}");
    }
}
