package level9_6;
//package com.javarush.task.task09.task0909;

/*
Исключение при работе с массивами
*/

public class Solution_easy3 {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            int[] m = new int[2];
            m[8] = 5;
            //напишите тут ваш код
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);;
        }
    }
}
