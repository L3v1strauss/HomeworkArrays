package com.homework.tasks;

import java.util.Arrays;

/**
 * 1. Напишите программу, которая циклически сдвигает элементы
 * массива вправо на одну позицию, и печатает результат.
 * Цикличность означает, что последний элемент массива становится
 * самым первым его элементом.
 */
public class HomeworkArraysTask1 {

    public static void main(String[] args) {
        int[] value = {0, 1, 2, 3};
        cycleArray(value);

    }

    public static void cycleArray(int[] value) {
        for (int i = 1; i < 5; i++) {
            shiftArray(value);
            for (int j = 0; j < value.length; j++) {
                System.out.print(value[j] + " ");
            }
            System.out.println();
        }
    }

    public static void shiftArray(int[] value) {
        int lastValue = value[value.length - 1];
        for (int i = 0; i < value.length; i++) {
            int currentValue = value[i];
            value[i] = lastValue;
            lastValue = currentValue;
        }


    }
}
