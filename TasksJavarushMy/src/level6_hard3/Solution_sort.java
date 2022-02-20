package level6_hard3;

public class Solution_sort {
    public static void main(String[] args) {
        int[] array = new int[] {64, 42, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36};
        printArray(array); //Вывести массив на консоль

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) { //Если правый элемент меньше, чем левый
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp; //мы меняем их местами
                    isSorted = false;
                }
            }
            printArray(array);
        }
    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }
}
