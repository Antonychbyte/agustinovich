package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * class StartWithTest - решение задачи "5.5. Слово начинается с ... [#41585]"
 *@author Густинович Антон (anton14024@yandex.ru)
 */
public class StartWithTest {
  @Test
  public void whenStartWithPrefixThenTrue() {
    StartWith check = new StartWith("Hello");
    boolean result = check.startWith("Hello");
    assertThat(result, is(true));
  }
  @Test
  public void whenNotStartWithPrefixThenFalse() {
    StartWith check = new StartWith("Hello");
    boolean result = check.startWith("Hi");
    assertThat(result, is(false));
  }
}