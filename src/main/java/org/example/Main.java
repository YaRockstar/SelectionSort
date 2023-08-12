package org.example;

import java.util.Arrays;

public class Main {
    /**
     * Сортировка выбором (Selection sort).
     * Особенности:
     * - "In-place" алгоритм - алгоритм, который использует малое кол-во памяти (не зависит от N).
     * - Stable (стабильный, устойчивый), то есть сохраняет относительный порядок элементов с одинаковыми значениями.
     * - Временная сложность квадратичаня O(N^2).
     * - Быстро деградирует, то есть время работы растет нелинейно.
     */
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
        int[] array = {4, 2, 1, 9, 0, 7, 6, 5, 8, 3};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}