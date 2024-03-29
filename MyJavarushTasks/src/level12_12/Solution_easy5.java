package level12_12;
//package com.javarush.task.task12.task1226;

/*
Лазать, летать и бегать
*/

public class Solution_easy5 {
    public interface CanFly {
        void fly();
    }

    public interface CanClimb {
        void climb();
    }

    public interface CanRun {
        void run();
    }

    public static void main(String[] args) {

    }

    public class Cat implements CanRun, CanClimb {
        public void run() {}
        public void climb() {}

    }

    public class Dog implements  CanRun {
        public void run() {}
    }

    public class Tiger extends Cat {
        public void run() {}
    }

    public class Duck implements CanRun, CanFly {
        public void run() {}
        public  void fly() {}
    }
}
