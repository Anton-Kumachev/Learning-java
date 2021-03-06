package level7_12;
//package com.javarush.task.task07.task0724;

/*
Семейная перепись
*/

public class Solution_hard2 {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandFather1 = new Human("Дед Макар", true, 80);
        Human grandFather2 = new Human("Дед Афанасий", true, 90);
        Human grandMother1 = new Human("Баба Люба", false, 70);
        Human grandMother2 = new Human("Баба Яга", false, 300);
        Human father = new Human("Батя", true, 40, grandFather1, grandMother1);
        Human mother = new Human("Маманя", false, 35, grandFather2, grandMother2);
        Human child1 = new Human("Пашка", true, 15, father, mother);
        Human child2 = new Human("Антон", true, 10, father, mother);
        Human child3 = new Human("Варвара", true, 8, father, mother);

        System.out.println(grandFather1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandMother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human {
        // напишите тут ваш код
        String name;   //имя
        boolean sex;   //пол
        int age;       //возраст
        Human father;  //отец
        Human mother;  //мать

        public Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human (String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }
            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }
            return text;
        }
    }
}