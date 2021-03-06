package ru.job4j.max;
/**
 * class Maximum - решение задачи "3.2. Максимум из двух чисел [#189]"
 *@author Густинович Антон (anton14024@yandex.ru)
 */
public class Maximum {

  public int max(int first, int second) {
    return first > second ? first : second;
  }
  public int max(int first, int second, int third) {
    return max(max(first, second), third);
  }
}