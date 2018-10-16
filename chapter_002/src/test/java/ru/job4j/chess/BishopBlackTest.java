package ru.job4j.chess;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import ru.job4j.chess.exceptions.ImpossibleMoveException;
import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.black.BishopBlack;

public class BishopBlackTest {

  @Test
  public void whenBishopBlackA1H8() {
    BishopBlack bishop = new BishopBlack(Cell.A1);
    Cell[] actual = bishop.way(bishop.position(), Cell.H8);
    Cell[] expected = {Cell.H8, Cell.G7, Cell.F6, Cell.E5, Cell.D4, Cell.C3, Cell.B2};
    assertThat(actual, is(expected));
  }
  @Test
  public void whenBishopBlackH8A1() {
    BishopBlack bishop = new BishopBlack(Cell.H8);
    Cell[] actual = bishop.way(bishop.position(), Cell.A1);
    Cell[] expected = {Cell.A1, Cell.B2, Cell.C3, Cell.D4, Cell.E5, Cell.F6, Cell.G7};
    assertThat(actual, is(expected));
  }
  @Test
  public void whenBishopBlackA8H1() {
    BishopBlack bishop = new BishopBlack(Cell.A8);
    Cell[] actual = bishop.way(bishop.position(), Cell.H1);
    Cell[] expected = {Cell.H1, Cell.G2, Cell.F3, Cell.E4, Cell.D5, Cell.C6, Cell.B7};
    assertThat(actual, is(expected));
  }
  @Test
  public void whenBishopBlackH1A8() {
    BishopBlack bishop = new BishopBlack(Cell.H1);
    Cell[] actual = bishop.way(bishop.position(), Cell.A8);
    Cell[] expected = {Cell.A8, Cell.B7, Cell.C6, Cell.D5, Cell.E4, Cell.F3, Cell.G2};
    assertThat(actual, is(expected));
  }


  @Test(expected = ImpossibleMoveException.class)
  public void whenBishopBlackF8A2ThenImpossibleMoveException() {
    BishopBlack bishopBlack = new BishopBlack(Cell.F8);
    Cell[] expect = {Cell.E7, Cell.D6, Cell.C5, Cell.B4, Cell.A3};
    assertThat(bishopBlack.way(bishopBlack.position(), Cell.A2), is(expect));
  }
}
