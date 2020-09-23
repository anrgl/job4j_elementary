package ru.job4j.pojo;

import ru.job4j.Defragment;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        products[index] = null;
        return Defragment.compress(products);
    }
}
