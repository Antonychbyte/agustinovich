package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * class FindLoopTest - решение задачи "5.1. Классический поиск перебором. [#33489]"
 * @author Густинович Антон (anton14024@yandex.ru)
 */
public class FindLoopTest {
  @Test
  public void whenTheNumberInTheArray() {
    FindLoop find = new FindLoop();
    int[] testArray = {1, 2, 3, 4};
    int result = find.indexOf(testArray, 3);
    int expect = 2;
    assertThat(result, is(expect));
  }
  @Test
  public void whenTheNumberIsNotInTheArray() {
    FindLoop find = new FindLoop();
    int[]testArray = {1, 2, 3, 4};
    int result = find.indexOf(testArray, 0);
    int expect = -1;
    assertThat(result, is(expect));
  }
}