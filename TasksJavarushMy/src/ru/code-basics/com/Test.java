package Temp;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        var company = "Hexlet";
        var companyLength = company.length();
        System.out.println(companyLength);

        String[] array = new String[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = "Java Developer";
        }

        ArrayList list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {

        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
