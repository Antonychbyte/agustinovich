package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;
/**
 * class ArrayDuplicate - решение задачи "5.5.  Удаление дубликатов в массиве. [#225]"
 *@author Густинович Антон (anton14024@yandex.ru)
 */
public class ArrayDuplicateTest {
  @Test
  public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
    ArrayDuplicate ad = new ArrayDuplicate();
    String[] arTest = {"1", "1", "1", "2", "2", "2"};
    String[] rsl = ad.remove(arTest);
    String[] expect = {"1", "2"};
    assertThat(rsl, arrayContainingInAnyOrder(expect));
  }
}