package level9_6;
//package com.javarush.task.task09.task0912;

/*
Исключение при работе с числами Ӏ Java Syntax: 9 уровень, 6 лекция
*/

public class Solution_easy6 {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        //напишите тут ваш код
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}
