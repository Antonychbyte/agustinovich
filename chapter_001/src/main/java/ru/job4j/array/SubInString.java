package ru.job4j.array;

/**
 *class SubInString - решение задачи "Проверка, что одно слово находится в другом слове [#228]"
 *@author Густинович Антон (anton14024@yandex.ru)
 */

class SubInString {
  /**
   * Метод проверяет, что строка содержит подстроку.
   * @param origin строка
   * @param sub подстрока
   * @return true если подстрока в строке
   */
  public boolean contains(String origin, String sub) {

    char[] o = origin.toCharArray();
    char[] s = sub.toCharArray();
    boolean result = true;

    int indOrigin = 0;
    int point;
    int indSub;

    while (o[indOrigin] != s[0]) {
      indOrigin++;
    }
    for (point = indOrigin, indSub = 0; indSub <= s.length - 1; point++, indSub++) {
      if (o[point] != s[indSub]) {
        result = false;
        break;
      }
    }
    return result;
  }
}