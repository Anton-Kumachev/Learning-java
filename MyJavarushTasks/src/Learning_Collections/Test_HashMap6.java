package Learning_Collections;

import java.util.HashMap;

public class Test_HashMap6 {
    public static void main(String[] args) {

        HashMap<Integer, String> passportsAndNames = new HashMap<>();

        passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        passportsAndNames.put(162348, "Иван Михайлович Серебряков");
        passportsAndNames.put(8082771, "Дональд Джон Трамп");

        if (!passportsAndNames.isEmpty()) {

            System.out.println(passportsAndNames);
        }

    }
}
