package ru.job4j.loop;
/**
 *class SumOfRange - решение задачи "4.1. Подсчет суммы чётных чисел в диапазоне [#192]"
 * @author  Густинович Антон (anton14024@yandex.ru
 */
public class Factorial {

  public int calc(int n) {
    int factorial = 1;
    for (int i = n; i >= 1; i--) {
      factorial = factorial * i;
    }
    return factorial;
  }
}