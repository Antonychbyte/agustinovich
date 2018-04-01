package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * class FindLoopTest - решение задачи "5.3. Создать программу для сортировки массива методом перестановки."
 * @author Густинович Антон (anton14024@yandex.ru)
 */
public class BubbleSortTest {
  @Test
  public void bubbleSortTest() {
    BubbleSort bst = new BubbleSort();
    int[] origin = {5, 1, 2, 5, 7, 3};
    int[] expected = {1, 2, 3, 5, 5, 7};
    assertThat(bst.sort(origin), is(expected));
  }
}
