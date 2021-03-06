package Learning_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Example5_Collections_swap {
    public static void main(String[] args) {

        String mercury = new String("Меркурий");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");
        String saturn = new String("Сатурн");
        String uranus = new String("Уран");
        String neptune = new String("Нептун");

        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(neptune, venus, earth, mars
                , jupiter, saturn, uranus, mercury));// неправильный порядок планет
        System.out.println(solarSystem);

        Collections.swap(solarSystem, solarSystem.indexOf(mercury), solarSystem.indexOf(neptune));
        System.out.println(solarSystem);

    }
}