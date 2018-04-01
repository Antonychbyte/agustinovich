package ru.job4j.array;
/**
 * class BubbleSort - решение задачи "5.3. Создать программу для сортировки массива методом перестановки."
 *@author Густинович Антон (anton14024@yandex.ru)
 */
public class BubbleSort {

  public int[] sort(int[] array) {
    for (int pass = 0; pass < array.length - 1; pass++) {
      for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1]) {
          int temp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temp;
        }
      }
    }
    return array;
  }
}