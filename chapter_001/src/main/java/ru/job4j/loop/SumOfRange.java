package ru.job4j.loop;
/**
 *class SumOfRange - решение задачи "4.1. Подсчет суммы чётных чисел в диапазоне [#192]"
 * @author  Густинович Антон (anton14024@yandex.ru
 */
public class SumOfRange {

  public int add(int start, int finish) {
    int sum = 0;
    if (start > finish) {
      int temp = start;
      start = finish;
      finish = temp;
    }
    for (int i = start; i <= finish; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    return sum;
  }
}
