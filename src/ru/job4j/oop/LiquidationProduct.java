package ru.job4j.oop;

public final class LiquidationProduct {
    private Product product;
    private String name;
    private int price;

    public LiquidationProduct(String name, int price) {
        product = new Product(name, price);
        this.name = name;
        this.price = price;
    }

    public int price() {
        return price - discount();
    }

    public int discount() {
        return 90;
    }

    public String label() {
        return product.label();
    }
}
