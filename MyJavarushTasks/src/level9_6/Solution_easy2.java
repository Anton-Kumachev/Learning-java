package level9_6;
//package com.javarush.task.task09.task0908;

/*
Исключение при работе со строками
*/

public class Solution_easy2 {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            String s = null;
            String m = s.toLowerCase();
            //напишите тут ваш код
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
