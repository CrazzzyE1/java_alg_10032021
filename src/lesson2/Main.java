package lesson2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {


//        + 1. Создать массив большого размера (100000 элементов).
//        + 2. В коде доделать проверки в местах с комментариями
//        + 3. Заполнить массив случайными числами.
//        + 4. Написать методы, реализующие рассмотренные виды сортировок,
//           и проверить скорость выполнения каждой.(Можете в комментариях написать измеренное время)

        /** Результаты:
         *
         * size = 1_000_000
         *
         * Несортированные массивы:
         * Selection sort: 461312
         * Insertion sort: 104262
         * Bubble sort: 1640900
         *
         * Сортированные массивы:
         * Selection sort: 144616
         * Insertion sort: 8
         * Bubble sort: 127827
         *
         * Выыоды:
         * При сортировке несотрированных массивов самая эффективная сортировка Вставками.
         * Пузырьковая сортировка показала самый худший результат.
         *
         *
         * При подаче на вход сортированных массивов очень эффективна сортровка Вставками.
         * Пузырьковая и Выбором показали одинаковую производительность.
         *
         * */

        int size = 1_000_000;
        int[] myArray = getArrayList(size);
        int[] tmp = new int[myArray.length];
        System.arraycopy(myArray, 0, tmp, 0, myArray.length);

        long start = System.currentTimeMillis();
        selectionSort(tmp);
        System.out.println("Selection sort: " + (System.currentTimeMillis() - start));


        System.arraycopy(myArray, 0, tmp, 0, myArray.length);
        start = System.currentTimeMillis();
        insertionSort(tmp);
        System.out.println("Insertion sort: " + (System.currentTimeMillis() - start));

        System.arraycopy(myArray, 0, tmp, 0, myArray.length);
        start = System.currentTimeMillis();
        bubbleSort(tmp);
        System.out.println("Bubble sort: " + (System.currentTimeMillis() - start));
    }

    public static int[] getArrayList(int size) {
        int[] tmp = new int[size];
        Random r = new Random();
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = (r.nextInt(1000));
//            tmp[i] = i;
        }
        return tmp;
    }

    public static void selectionSort(int[] arr) {
        int iMin;
        for (int i = 0; i < arr.length - 1; i++) {
            iMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (less(arr[j], arr[iMin])) {
                    iMin = j;
                }
            }
            swap(arr, i, iMin);
        }
    }

    public static void insertionSort(int[] arr) {
        int key;
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            key = arr[i];
            while (j > 0 && less(key, arr[j - 1])) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = key;
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (less(arr[j + 1], arr[j])) {
                    swap(arr, j + 1, j);
                }
            }
        }
    }

    private static boolean less(int index1, int index2) {
        return index1 < index2;
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
