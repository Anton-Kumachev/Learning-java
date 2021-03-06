package level7;
//package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Массивный максимум
*/
public class Solution_medium1 {

    public static void main(String[] args) throws Exception { //Этот метод нельзя изменять (по условиям задачи)
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20]; //Создание массива

        for (int i = 0; i < array.length; i++) { //Заполнение массива с консоли
            String s = reader.readLine();
            array[i] = Integer.parseInt(s);
        }
        return array;
    }

    public static int max (int[] array) {
            // найди максимальное значение
            int max = array[0];

            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
    }
}