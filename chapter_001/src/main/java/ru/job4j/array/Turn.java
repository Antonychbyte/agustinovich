package ru.job4j.array;

/**
 * class FindLoopTest - решение задачи "5.2. Перевернуть массив [#4441]"
 * @author Густинович Антон (anton14024@yandex.ru)
 */

public class Turn {

  public int[] turn(int[] array) {
    for (int index = 0; index < array.length / 2; index++) {
      int temp = array[index];
      array[index] = array[array.length - 1 - index];
      array[array.length - 1 - index] = temp;
    }
    return array;
  }

}