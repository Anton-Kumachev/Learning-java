package level10_4;
//package com.javarush.task.task10.task1003;

/*
Задача №3 на преобразование целых типов
*/

public class Solution_easy3 {
    public static void main(String[] args) {
        float f = (int) 128.50;
        int i = (byte) f;
        int b = (int) (i + f);
        System.out.println(b);
    }
}
