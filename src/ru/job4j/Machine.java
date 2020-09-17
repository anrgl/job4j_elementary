package ru.job4j;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;

        money -= price;
        for (int coin : COINS) {
            while (money - coin >= 0) {
                rsl[size++] = coin;
                money -= coin;
            }
        }

        return Arrays.copyOf(rsl, size);
    }
}
