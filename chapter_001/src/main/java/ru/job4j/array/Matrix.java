package ru.job4j.array;
/**
 * class Matrix - решение задачи "5.4. Двухмерный массив. Таблица умножения. [#33491]"
 *@author Густинович Антон (anton14024@yandex.ru)
 */
public class Matrix {

  public int[][] multiple(int size) {
    int[][] array = new int[size][size];
    for (int row = 0; row < size; row++) {
      for (int column = 0; column < size; column++) {
        array[row][column] = (row + 1) * (column + 1);
      }
    }
    return array;
  }
}