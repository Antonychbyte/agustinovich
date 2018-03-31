package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 class ArraysMergingTest - контрольное задание "Слияние отсортированых массивов."
 @author Густинович Антон (anton@yandex.ru)
 */
public class ArraysMergingTest {
  @Test
  public void arraysMergingTest() {

    ArraysMerging merging = new ArraysMerging();

    int[] array1 = {1, 10, 10, 14};
    int[] array2 = {2, 5, 11, 20, 20};
    int[] result = merging.arraysMerging(array1, array2);
    int[] expect = {1, 2, 5, 10, 10, 11, 14, 20, 20};

    assertThat(result, is(expect));
  }
}
