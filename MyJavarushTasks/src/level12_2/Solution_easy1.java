package level12_2;
//package com.javarush.task.task12.task1201;

/*
Киты и коровы
*/

public class Solution_easy1 {
    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "Я - корова";
        }
    }

    public static class Whale extends Cow {
        public String getName() {
            return "Я не корова, Я - кит.";
        }
    }
}