package level8_11;
//package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/*
Пять победителей
*/

public class Solution_medium2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        //Пузырьковая сортировка в обратную сторону
        for (int i = 0 ; i < array.length ; i++) {
            for (int j = i ; j < array.length ; j++) {
                if (array[i] < array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
