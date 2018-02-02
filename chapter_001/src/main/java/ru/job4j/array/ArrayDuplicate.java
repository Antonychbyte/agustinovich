package ru.job4j.array;

import static java.util.Arrays.copyOf;

/**
 * class ArrayDuplicate - решение задачи "5.5.  Удаление дубликатов в массиве. [#225]"
 *@author Густинович Антон (anton14024@yandex.ru)
 */

public class ArrayDuplicate {

  public  String[] remove(String[] array) {

    int tail = 0;

    for (int out = 0; out < array.length - tail; out++) {
      for (int in = out+1; in < array.length - tail; in++) {
         if (array[out].equals(array[in])) {
          String tmp = array[in];
          array[in] = array[array.length - 1  - tail];
          array[array.length - 1 - tail] = tmp;
          in--;
          tail++;
        }
      }
    }
    return copyOf(array, array.length - tail);
  }
}


