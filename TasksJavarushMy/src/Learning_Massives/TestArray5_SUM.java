package Learning_Massives;
//Пример: Сумма массива
public class TestArray5_SUM {
    public static void main(String[] args) {
        // Нахождение суммы элементов в массиве myArray из 5 элементов типа double.
        double[] myList = {2.5, 1.8, 1.3, 6.5, 22.8};
        // Инициализируем переменную total.
        double total = 0;

        // Прибавляем к переменной total каждый элемент массива.
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }

        // Вывод результата на экран.
        System.out.println("Сумма элементов массива myList: " + total);
    }
}