package lesson02;

import java.util.ArrayList;

//Динамичекский массив

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        for (Integer x : arrayList) {
            System.out.println(x);
        }
    }
}
