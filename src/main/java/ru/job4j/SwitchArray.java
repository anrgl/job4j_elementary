package ru.job4j;

import ru.job4j.pojo.Product;

public class SwitchArray {
    public static int[] swap(int[] array, int source, int dest) {
        int tmp = array[source];
        array[source] = array[dest];
        array[dest] = tmp;
        return array;
    }

    public static String[] swap(String[] array, int source, int dest) {
        String tmp = array[source];
        array[source] = array[dest];
        array[dest] = tmp;
        return array;
    }

    public static Product[] swap(Product[] products, int source, int dest) {
        Product tmp = products[source];
        products[source] = products[dest];
        products[dest] = tmp;
        return products;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int i : rsl) {
            System.out.println(i);
        }
    }
}
