package ru.job4j.array;

/**
 * class BubbleSort - решение задачи "5.3. Создать программу для сортировки массива методом перестановки."
 *@author Густинович Антон (anton14024@yandex.ru)
 */

public class BubbleSort {

    public int[] sort(int[] array) {

        for (int j = 0; j < array.length - 1; j++) {

            for (int index = 0; index < array.length - 1; index++) {

                if (array[index] > array[index + 1]) {

                    int tmp = array[index];

                    array[index] = array[index + 1];

                    array[index + 1] = tmp;
                }
            }
        }
        return array;
    }
}