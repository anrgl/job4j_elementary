package ru.job4j.oop;

public class Shop {
    public static void main(String[] args) {
        Product product = new Product("Oil", 100);
        System.out.println(product.label());

        LiquidationProduct liquidationProduct = new LiquidationProduct("Spam", 150);
        System.out.println(liquidationProduct.label());
    }
}