package lesson11;

public class Arrays {
    public static void main(String[] args) {
        int number = 10; // примитивный тип данных [10]
        int[] numbers = new int[5]; // numbers -> [массив] ссылочный тип данных
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
            System.out.println(numbers[i]);
        }
        System.out.println("");//Пустая строка

        int[] numbers1 = {1, 2, 3};
        System.out.println(java.util.Arrays.toString(numbers1)); //Вывод массива через метод toString() класса Arrays

        System.out.println("");//Пустая строка

        int[] numbers3 = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};

        java.util.Arrays.sort(numbers3); //Соритровка массива по возратсанию

        System.out.println(java.util.Arrays.toString(numbers3));
    }

}


