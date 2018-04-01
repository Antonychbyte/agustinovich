package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * class MatrixTest - решение задачи "5.4. Двухмерный массив. Таблица умножения.[#33491]"
 * @author Густинович Антон (anton14024@yandex.ru)
 */
public class MatrixTest {
  @Test
  public void whenFourByFourMatrix() {
    Matrix matrix = new Matrix();
    int[][] expect = {
        {1, 2, 3,  4},
        {2, 4, 6,  8},
        {3, 6, 9,  12},
        {4, 8, 12, 16}
    };
    int[][] result = matrix.multiple(4);
    assertThat(result, is(expect));
  }
}