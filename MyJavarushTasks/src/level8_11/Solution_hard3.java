package level8_11;
//package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Омовение Рамы
*/

public class Solution_hard3 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        //напишите тут ваш код
        String[] words = string.split(" +");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != 0 ) { // проверка, чтоб строка не начиналась на пробел
                System.out.print(" " + words[i].substring(0,1).toUpperCase() +  words[i].substring(1).toLowerCase() + " ");
            }
        }
    }
}
