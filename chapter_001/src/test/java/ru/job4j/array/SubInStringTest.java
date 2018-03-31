package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *class SubInStringTest - решение задачи "Проверка, что одно слово находится в другом слове [#228]"
 *@author Густинович Антон (anton14024@yandex.ru)
 */
public class SubInStringTest {

  @Test
  public void whenSubInOrigin() {
    SubInString subInString = new SubInString();
    String origin = "Привет";
    String sub = "иве";
    boolean expect = true;
    boolean result = subInString.contains(origin, sub);

    assertThat(result, is(expect));
  }
}
