package ru.job4j.array;
/**
 * class StartWith - решение задачи "5.5. Слово начинается с ... [#41585]"
 *@author Густинович Антон (anton14024@yandex.ru)
 */
public class StartWith {

  private char[] line;

  public StartWith(String line) {
    this.line = line.toCharArray();
  }
  /**
   * Проверяет. что слово начинается с префикса.
   * @param prefix префикс.
   * @return если слово начинаеться с префикса
   */
  public boolean startWith(String prefix) {
    boolean result = true;
    char[] chars = prefix.toCharArray();
    for (int index = 0; index <= chars.length - 1; index++) {
      if (line[index] != chars[index]) {
        result = false;
        break;
      }
    }
    return result;
  }
}