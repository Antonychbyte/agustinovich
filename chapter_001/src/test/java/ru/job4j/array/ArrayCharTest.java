package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * class ArrayCharTest - решение задачи "5.5. Слово начинается с ... [#41585]"
 *@author Густинович Антон (anton14024@yandex.ru)
 */
public class ArrayCharTest {
  @Test
  public void whenStartWithPrefixThenTrue() {
    ArrayChar word = new ArrayChar("Hello");
    boolean result = word.startWith("Hello");
    assertThat(result, is(true));
  }

  @Test
  public void whenNotStartWithPrefixThenFalse() {
    ArrayChar word = new ArrayChar("Hello");
    boolean result = word.startWith("Hi");
    assertThat(result, is(false));
  }
}