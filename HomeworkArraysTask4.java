package com.homework.tasks;

import java.util.Arrays;

/**
 * 4. Написать функцию linearize, которая принимает в качестве
 * параметра двумерный массив
 * и возвращает одномерный массив со всеми элементами
 * двумерного.
 */
public class HomeworkArraysTask4 {

    public static void main(String[] args) {
        int[][] values = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3},
        };
        System.out.print(linearize(values));
    }

    public static int linearize(int[][] values) {
        int[] randomArray = new int[9];
        int currentIndex = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                randomArray[j] = values[i][j];
                randomArray[currentIndex] = randomArray[j];
                currentIndex++;
            }
        }

        return randomArray;
    }
}




