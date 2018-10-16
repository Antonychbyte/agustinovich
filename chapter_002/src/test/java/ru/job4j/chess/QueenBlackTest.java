package ru.job4j.chess;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

import ru.job4j.chess.exceptions.ImpossibleMoveException;
import ru.job4j.chess.figures.black.QueenBlack;
import ru.job4j.chess.figures.Cell;

public class QueenBlackTest {
 @Test
  public void whenQueenBlackA1H8() {
   QueenBlack queenBlack = new QueenBlack(Cell.A1);
   Cell[] expect = {Cell.H8, Cell.G7, Cell.F6, Cell.E5, Cell.D4, Cell.C3, Cell.B2 };
   assertThat(queenBlack.way(queenBlack.position(), Cell.H8), is(expect));
 }
 @Test
  public void whenQueenBlackH8A1() {
   QueenBlack queenBlack = new QueenBlack(Cell.H8);
   Cell[] expect = {Cell.A1, Cell.B2, Cell.C3, Cell.D4, Cell.E5, Cell.F6, Cell.G7};
   assertThat(queenBlack.way(queenBlack.position(), Cell.A1), is(expect));
 }
  @Test
  public void whenQueenBlackH1A8() {
    QueenBlack queenBlack = new QueenBlack(Cell.H1);
    Cell[] expect = {Cell.A8, Cell.B7, Cell.C6, Cell.D5, Cell.E4, Cell.F3, Cell.G2};
    assertThat(queenBlack.way(queenBlack.position(), Cell.A8), is(expect));
  }
  @Test
  public void whenQueenBlackA8H1() {
    QueenBlack queenBlack = new QueenBlack(Cell.A8);
    Cell[] expect = {Cell.H1, Cell.G2, Cell.F3, Cell.E4, Cell.D5, Cell.C6, Cell.B7};
    assertThat(queenBlack.way(queenBlack.position(), Cell.H1), is(expect));
  }
  @Test
  public void whenQueenBlackA1A8() {
    QueenBlack queenBlack = new QueenBlack(Cell.A1);
    Cell[] expect = {Cell.A8, Cell.A7, Cell.A6, Cell.A5, Cell.A4, Cell.A3, Cell.A2};
    assertThat(queenBlack.way(queenBlack.position(), Cell.A8), is(expect));
  }
  @Test
  public void whenQueenBlackA8A1() {
    QueenBlack queenBlack = new QueenBlack(Cell.A8);
    Cell[] expect = {Cell.A1, Cell.A2, Cell.A3, Cell.A4, Cell.A5, Cell.A6, Cell.A7};
    assertThat(queenBlack.way(queenBlack.position(), Cell.A1), is(expect));
  }
  @Test
  public void whenQueenBlackA1H1() {
    QueenBlack queenBlack = new QueenBlack(Cell.A1);
    Cell[] expect = {Cell.H1, Cell.G1, Cell.F1, Cell.E1, Cell.D1, Cell.C1, Cell.B1};
    assertThat(queenBlack.way(queenBlack.position(), Cell.H1), is(expect));
  }
  @Test
  public void whenQueenBlackH1A1() {
    QueenBlack queenBlack = new QueenBlack(Cell.H1);
    Cell[] expect = {Cell.A1, Cell.B1, Cell.C1, Cell.D1, Cell.E1, Cell.F1, Cell.G1};
    assertThat(queenBlack.way(queenBlack.position(), Cell.A1), is(expect));
  }
  @Test(expected = ImpossibleMoveException.class)
  public void whenQueenBlackH1A2ThenImpossibleMoveException() {
   QueenBlack queenBlack = new QueenBlack(Cell.H1);
   Cell[] expect = {Cell.A2};
   assertThat(queenBlack.way(queenBlack.position(), Cell.A2), is(expect));
  }



}
