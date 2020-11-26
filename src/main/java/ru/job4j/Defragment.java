package ru.job4j;

import ru.job4j.pojo.Product;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                for (int i = index; i < array.length; i++) {
                    if (array[i] != null) {
                        SwitchArray.swap(array, i, index);
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static Product[] compress(Product[] products) {
        for (int index = 0; index < products.length; index++) {
            if (products[index] == null) {
                for (int i = index; i < products.length; i++) {
                    if (products[i] != null) {
                        SwitchArray.swap(products, i, index);
                        break;
                    }
                }
            }
            System.out.print(products[index] + " ");
        }
        return products;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (String s : compressed) {
            System.out.print(s + " ");
        }
    }
}
