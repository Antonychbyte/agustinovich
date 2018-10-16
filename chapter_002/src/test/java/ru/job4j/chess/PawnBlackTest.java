package ru.job4j.chess;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import ru.job4j.chess.exceptions.ImpossibleMoveException;
import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.black.PawnBlack;

public class PawnBlackTest {
  @Test
  public void pawnBlackTest() {
    PawnBlack pawnBlack = new PawnBlack(Cell.A6);
    Cell[] expect = {Cell.A5};
    assertThat(pawnBlack.way(pawnBlack.position(), Cell.A5), is(expect));
  }
  @Test(expected = ImpossibleMoveException.class)
  public void whenImpossibleMoveException() {
    PawnBlack pawnBlack = new PawnBlack(Cell.A6);
    Cell[] expect = {Cell.B6};
    assertThat(pawnBlack.way(pawnBlack.position(), Cell.B6), is(expect));
  }
}
