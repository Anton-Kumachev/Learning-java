package level7_6;
//package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
В начало списка
*/

public class Solution1_2 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(0, s);
        }
        for (String x : list) {
            System.out.println(x);
        }
    }
}


