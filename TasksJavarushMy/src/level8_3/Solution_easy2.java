package level8_3;
//package com.javarush.task.task08.task0802;

/*
Map из 10 пар
*/

import java.util.HashMap;
import java.util.Map;

public class Solution_easy2 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();  //ключ
            String value = pair.getValue(); //значение
            System.out.println(key + " - " + value);
        }
    }
}