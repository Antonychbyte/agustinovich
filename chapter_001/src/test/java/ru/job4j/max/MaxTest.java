package ru.job4j.max;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *test for Max.java, решение задачи "3.2. Максимум из двух чисел [#189]".
 *@author Густинович Антон (anton14024@yandex.ru)
 */

public class MaxTest {

       @Test
       public void whenFirstLessSecond() {
              Max maxObject = new Max();

              assertThat(maxObject.max(-2, 1 ), is(1));
       }

       @Test
       public void whenFirstMoreSecond() {
              Max maxObject = new Max();

              assertThat(maxObject.max(2, -2, 1), is(2));
       }

       @Test
       public void whenFirstEqualsSecond() {
              Max maxObject = new Max();

              assertThat(maxObject.max(0, 0, 0), is(0));
       }

}