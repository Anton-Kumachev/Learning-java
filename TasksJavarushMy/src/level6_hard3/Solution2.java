package level6_hard3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Числа по возрастанию
*/
//Решение от JAVARUSH
public class Solution2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        int thirdNumber = Integer.parseInt(reader.readLine());
        int fourthNumber = Integer.parseInt(reader.readLine());
        int fifthNumber = Integer.parseInt(reader.readLine());

        int[] array = new int[]{firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber};
        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }
    //Сортировка пузырьком
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
