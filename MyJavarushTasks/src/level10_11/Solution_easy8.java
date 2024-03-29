package level10_11;
//package com.javarush.task.task10.task1020;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Задача по алгоритмам Ӏ Java Syntax: 10 уровень, 11 лекция
*/

public class Solution_easy8 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                int min = array[i];
                if (array[i + 1] < min) {
                    array[i] = array[i + 1];
                    array[i + 1] = min;
                    isSorted = false;
                }
            }
        }
    }
}
