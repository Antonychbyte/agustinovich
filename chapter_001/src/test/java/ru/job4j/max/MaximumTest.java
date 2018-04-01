package ru.job4j.max;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 *test for Maximum.java, решение задачи "3.2. Максимум из двух чисел [#189]".
 *@author Густинович Антон (anton14024@yandex.ru)
 */
public class MaximumTest {
  @Test
  public void whenFirstLessSecond() {
    Maximum find = new Maximum();
    assertThat(find.max(-2, 1), is(1));
  }
  @Test
  public void whenFirstMoreSecond() {
    Maximum find = new Maximum();
    assertThat(find.max(2, -2, 1), is(2));
  }
  @Test
  public void whenFirstEqualsSecond() {
    Maximum find = new Maximum();
    assertThat(find.max(0, 0, 0), is(0));
  }
}