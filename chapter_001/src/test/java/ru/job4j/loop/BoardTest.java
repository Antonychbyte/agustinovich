package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * class BoardTest - решение задачи "4.3. Построить шахматную доску в псевдографике. [#13559]"
 * @author Густинович Антон (anton14024@yandex.ru
 */

public class BoardTest {

       @Test
       public void whenHeightThreeAndWidthThree() {

              Board board = new Board();
              String ls = System.lineSeparator();
              String result = board.buildBoard(3, 3);
              String expected = String.format("x x%s x %sx x%s", ls, ls, ls);

              assertThat(result, is(expected));
       }

       @Test
       public void whenHeightFourAndWidthFive() {

              Board board = new Board();
              String ls = System.lineSeparator();
              String result = board.buildBoard(4, 5);
              String expected = String.format("x x x%s x x %sx x x%s x x %s", ls, ls, ls, ls);

              assertThat(result, is(expected));
       }
}