package Learning_Collections;

//Вывод на экран элементов Map

import java.util.HashMap;

public class Example4_2_Map {
    public static void main(String[] args) {
        //все элементы хранятся в парах
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Серега", 21);
        map.put("Николай", 22);
        map.put("Иван Петрович", 48);
        map.put("Анюта", null);

        System.out.println(map);
    }
}