package ru.job4j.chess;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.black.RookBlack;

public class RookBlackTest {
  @Test
  public void whenRookBlackA1A8() {
    RookBlack rookBlack = new RookBlack(Cell.A1);
    Cell[] expect = {Cell.A8, Cell.A7, Cell.A6, Cell.A5, Cell.A4, Cell.A3, Cell.A2};
    assertThat(rookBlack.way(rookBlack.position(), Cell.A8), is(expect));
  }
  @Test
  public void whenA3H3() {
    RookBlack rookBlack = new RookBlack(Cell.A3);
    Cell[] expect = {Cell.H3, Cell.G3, Cell.F3, Cell.E3, Cell.D3, Cell.C3, Cell.B3};
    assertThat(rookBlack.way(rookBlack.position(), Cell.H3), is(expect));
  }
}
