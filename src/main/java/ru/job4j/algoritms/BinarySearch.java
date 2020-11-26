package ru.job4j.algoritms;

public class BinarySearch {
    public static int search(int guess, int[] numbers) {
        int count = 1;
        int low = 1;
        int high = numbers.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            int item = numbers[mid];
            count++;
            if (guess > item) {
                low = mid + 1;
            } else if (guess < item) {
                high = mid - 1;
            } else {
                break;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        System.out.println(search(1, numbers));
    }
}
