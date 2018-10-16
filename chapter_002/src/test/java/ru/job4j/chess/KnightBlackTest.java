package ru.job4j.chess;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import ru.job4j.chess.exceptions.ImpossibleMoveException;
import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.black.KnightBlack;

public class KnightBlackTest {

  KnightBlack knightBlack = new KnightBlack(Cell.D4);

  @Test
  public void whenKnightD4F5() {
    Cell[] expect = {Cell.F5};
    assertThat(knightBlack.way(knightBlack.position(), Cell.F5), is(expect));
  }
  @Test
  public void whenKnightD4F3() {
    Cell[] expect = {Cell.F3};
    assertThat(knightBlack.way(knightBlack.position(), Cell.F3), is(expect));
  }
  @Test
  public void whenKnightD4E2() {
    Cell[] expect = {Cell.E2};
    assertThat(knightBlack.way(knightBlack.position(), Cell.E2), is(expect));
  }
  @Test
  public void whenKnightD4C2() {
    Cell[] expect = {Cell.C2};
    assertThat(knightBlack.way(knightBlack.position(), Cell.C2), is(expect));
  }
  @Test
  public void whenKnightD4B3() {
    Cell[] expect = {Cell.B3};
    assertThat(knightBlack.way(knightBlack.position(), Cell.B3), is(expect));
  }
  @Test
  public void whenKnightD4B5() {
    Cell[] expect = {Cell.B5};
    assertThat(knightBlack.way(knightBlack.position(), Cell.B5), is(expect));
  }
  @Test
  public void whenKnightD4C6() {
    Cell[] expect = {Cell.C6};
    assertThat(knightBlack.way(knightBlack.position(), Cell.C6), is(expect));
  }
  @Test
  public void whenKnightD4E6() {
    Cell[] expect = {Cell.E6};
    assertThat(knightBlack.way(knightBlack.position(), Cell.E6), is(expect));
  }
  @Test(expected = ImpossibleMoveException.class)
  public void whenKnightD4F6ThenImpossibleMoveException() {
    Cell[] expect = {Cell.F6};
    assertThat(knightBlack.way(knightBlack.position(), Cell.F6), is(expect));
  }
}
