package level9_6;
//package com.javarush.task.task09.task0910;

import java.util.ArrayList;

/*
Исключение при работе с коллекциями List
*/

public class Solution_easy4 {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        //напишите тут ваш код
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
