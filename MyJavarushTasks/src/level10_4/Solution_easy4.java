package level10_4;
//package com.javarush.task.task10.task1005;

/*
Задача №5 на преобразование целых типов
*/

public class Solution_easy4 {
    public static void main(String[] args) {
        int a = (byte) 44;
        int b = (short) 300;
        short c = (short) (b - a);
        System.out.println(c);
    }
}