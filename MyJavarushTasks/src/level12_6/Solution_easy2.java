package level12_6;
//package com.javarush.task.task12.task1212;

/*
«Исправь код», часть 1
*/

public class Solution_easy2 {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public String getName() {
            return "Я - котенок";
        }

        public abstract Pet getChild();
    }
}
