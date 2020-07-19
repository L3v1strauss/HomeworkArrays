package com.homework.tasks;

/**
 * 3. Заданы 2 массива целых чисел произвольной длины. 
 *     Написать программу, создающую третий массив,
 * представляющий собой слияние 2-х заданных.
 * Пример:
 * 1-й массив: {1, 2, 3, 4, 5}
 * 2-й массив: {5, 6, 7}
 * Результат: {1, 5, 2, 6, 3, 7, 4, 5}
 */
public class HomeworkArraysTask3 {

    public static void main(String[] args) {
        int[] values1 = {1, 2, 3, 4, 5};
        int[] values2 = {5, 6, 7};
        int[] values3 = new int[8];
        newArray(values1, values2, values3);
        printArray(values3);
    }

    public static void printArray(int[] values3) {
        for (int value : values3) {
            System.out.print(value + " ");

        }
    }

    public static void newArray(int[] values1, int[] values2, int[] values3) {
        int currentIndex1 = 0;
        int currentIndex2 = 0;
        for (int i = 0; i < values3.length; i++) {
            if (i % 2 == 0 || i == values3.length - 1) {
                values3[i] = values1[currentIndex1];
                currentIndex1++;
            } else {
                values3[i] = values2[currentIndex2];
                currentIndex2++;
            }

        }

    }
}
