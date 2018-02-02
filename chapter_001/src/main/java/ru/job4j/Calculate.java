package ru.job4j;

/**
 *class Calculate - решение задачи "1.1. Создание Hello World [#141]"
 *@author Густинович Антон (anton14024@yandex.ru)
 *@since 12.12.17
 *@version 1.0
 */
public class Calculate {
  /**
   * Метод выводит на консоль текст "Hello world!"
   */
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  /**
   *Method echo
   *@param name
   *@return Echo plus name
   */
  public String echo(String name) {
    return "Echo, Echo, Echo : " + name;
  }
}

