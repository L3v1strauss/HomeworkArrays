package com.homework.tasks;

import java.util.Arrays;

/**
 * 2. Написать программу, удаляющую все повторяющиеся целые
 * числа из массива и печатающую результат. Массив должен
 * использоваться тот же самый. На место удаленных элементов
 * ставить цифру 0.
 */
public class HomeworkArraysTask2 {

    public static void main(String[] args) {

        int[] values = {1, 2, 1, 5, 3, 5, 9, 10, 9};
        correctArray(values);
        printArray(values);
    }

    public static void printArray(int[] values) {
        for (int value : values) {
            System.out.println(value + " ");

        }
    }

    public static void correctArray(int[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[i] == values[j]) {
                    values[j] = 0;
                }
            }
        }
    }
}
