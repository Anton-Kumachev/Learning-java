package level10_11;
//package com.javarush.task.task10.task1010;

/*
Правильный ответ: d = 1.0
*/

public class Solution_easy3 {
    public static void main(String[] args) {
        int a = 257;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = (byte) a + b / c / e;

        System.out.println(d);
    }
}
