package ru.job4j.array;

/**
 * class ArrayChar - решение задачи "5.5. Слово начинается с ... [#41585]"
 *@author Густинович Антон (anton14024@yandex.ru)
 */

public class ArrayChar {

  private char[] data;

  public ArrayChar(String line) {
    this.data = line.toCharArray();
  }
  /**
   * Проверяет. что слово начинается с префикса.
   * @param prefix префикс.
   * @return если слово начинаеться с префикса
   */
  public boolean startWith(String prefix) {

    boolean result = true;
    char[] value = prefix.toCharArray();

    for (char index = 0; index <= value.length - 1; index++) {
      if (data[index] != value[index]) {
        result = false;
      }
    }
    return result;
  }
}