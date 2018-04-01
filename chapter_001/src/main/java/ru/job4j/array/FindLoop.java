package ru.job4j.array;
/**
 * class FindLoop - решение задачи "5.1. Классический поиск перебором. [#33489]"
 * @author Густинович Антон (anton14024@yandex.ru)
 */
public class FindLoop {
  public int indexOf(int[]data, int value) {
    int result = -1;
    for (int index = 0; index < data.length; index++) {
      if (data[index] == value) {
        result = index;
        break;
      }
    }
    return result;
  }
}