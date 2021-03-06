package Learning_Collections;

//Вывод на экран элементов Map

import java.util.HashMap;
import java.util.Map;

public class Example4_2_Map_foreach3 {
    public static void main(String[] args) {
        //все элементы хранятся в парах
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Серега", 21);
        map.put("Николай", 22);
        map.put("Иван Петрович", 48);
        map.put("Анюта", null);

        for(Map.Entry<String, Integer> pair: map.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + " --> " + value);
        }
    }
}