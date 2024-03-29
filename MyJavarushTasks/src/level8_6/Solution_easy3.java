package level8_6;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/*
Время для 10 тысяч вызовов get
*/

public class Solution_easy3 {
    public static void main(String[] args) {
        System.out.println(getGetTimeInMs(fill(new ArrayList())));
        System.out.println(getGetTimeInMs(fill(new LinkedList())));
    }

    public static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getGetTimeInMs(List list) {
        // напишите тут ваш код
        Date start = new Date();
        get10000(list);//Тут мы вызываем элемент из середины списка
        // напишите тут ваш код
        Date end = new Date(); //Создаём новый объект, чтобы "замерить" время, которое прошло с момента обращения
                               // к элементу из середины списка
        return end.getTime() - start.getTime();
    }

    public static void get10000(List list) {
        if (list.isEmpty()) {
            return;
        }
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}
