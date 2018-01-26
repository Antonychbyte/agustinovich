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

              FindLoop findLoop = new FindLoop();
              int[]testArray = {1, 2, 3, 4};
              int rls = findLoop.indexOf(testArray, 3);
              assertThat(3, is(rls));
       }
       @Test
       public void whenTheNumberIsNotInTheArray() {

              FindLoop findLoop = new FindLoop();
              int[]testArray = {1, 2, 3, 4};
              int rls = findLoop.indexOf(testArray, 0);
              assertThat(-1, is(rls));
       }
}