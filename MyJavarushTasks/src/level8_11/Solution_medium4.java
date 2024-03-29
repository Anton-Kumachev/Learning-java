package level8_11;
//package com.javarush.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Задача по алгоритмам Ӏ Java Syntax: 8 уровень, 11 лекция
*/

public class Solution_medium4 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        String temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (isGreaterThan(array[i], array[j])) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                }
            }

        }
    }
        //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan (String a, String b){
        return a.compareTo(b) > 0;
    }
}
