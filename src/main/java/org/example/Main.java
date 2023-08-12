package org.example;

import java.util.Arrays;

public class Main {
    public static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void selectionSort(int[] arr) {
        int wall = 0;
        int minElementIndex = 0;

        while (wall < arr.length - 1) {
            for (int i = wall + 1; i < arr.length; i++) {
                if (arr[i] < arr[minElementIndex]) {
                    minElementIndex = i;
                }
            }

            swap(arr, minElementIndex, wall);
            wall++;
            minElementIndex = wall;
        }

    }

    public static void main(String[] args) {
        int[] array = {4, 2, 1, 9, 0, 1, 7, 6, 3, 5, 8, 3};
        System.out.println("Before: " + Arrays.toString(array));
        selectionSort(array);
        System.out.println("After: " + Arrays.toString(array));
    }
}