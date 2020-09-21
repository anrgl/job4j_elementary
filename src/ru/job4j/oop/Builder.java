package ru.job4j.oop;

public class Builder extends Engineer {
    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void build() {
        System.out.println("House");
    }
}
