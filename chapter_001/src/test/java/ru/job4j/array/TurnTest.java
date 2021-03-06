package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * class FindLoopTest - решение задачи "5.2. Перевернуть массив [#4441]"
 * @author Густинович Антон (anton14024@yandex.ru)
 */
public class TurnTest {
  @Test
  public void whenLengthIsEven() {
    Turn turner = new Turn();
    int[] array = {1, 2, 3, 4};
    int[] expect = {4, 3, 2, 1};
    assertThat(turner.turn(array), is(expect));
  }
  @Test
  public void whenLengthIsNotEven() {
    Turn turner = new Turn();
    int[] array = {1, 2, 3, 4, 5};
    int[] expect = {5, 4, 3, 2, 1};
    assertThat(turner.turn(array), is(expect));
  }
}