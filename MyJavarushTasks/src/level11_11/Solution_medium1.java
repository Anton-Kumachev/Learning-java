package level11_11;
//package com.javarush.task.task11.task1123;

/*
Минимакс
*/

import java.util.Arrays;

public class Solution_medium1 {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair result = getMinimumMaximumPair(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair getMinimumMaximumPair(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair(null, null);
        }
        // напишите тут ваш код
        Arrays.sort(inputArray);
        int x = inputArray[0];
        int y = inputArray[inputArray.length - 1];

        return new Pair(x, y);
    }

    public static class Pair {
        public Integer x;
        public Integer y;

        public Pair(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }
    }
}
