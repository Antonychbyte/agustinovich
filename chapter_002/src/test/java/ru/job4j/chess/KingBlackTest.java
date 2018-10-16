package ru.job4j.chess;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

import ru.job4j.chess.exceptions.ImpossibleMoveException;
import ru.job4j.chess.figures.black.KingBlack;
import ru.job4j.chess.figures.Cell;

public class KingBlackTest {

  KingBlack kingBlack = new KingBlack(Cell.D4);
  @Test
  public void whenKingBlackD4D5() {
    Cell[] expect = {Cell.D5};
    assertThat(kingBlack.way(kingBlack.position(), Cell.D5), is(expect));
  }
  @Test
  public void whenKingBlackD4E5() {
    Cell[] expect = {Cell.E5};
    assertThat(kingBlack.way(kingBlack.position(), Cell.E5), is(expect));
  }
  @Test
  public void whenKingBlackD4E4() {
    Cell[] expect = {Cell.E4};
    assertThat(kingBlack.way(kingBlack.position(), Cell.E4), is(expect));
  }
  @Test
  public void whenKingBlackD4E3() {
    Cell[] expect = {Cell.E3};
    assertThat(kingBlack.way(kingBlack.position(), Cell.E3), is(expect));
  }
  @Test
  public void whenKingBlackD4D3() {
    Cell[] expect = {Cell.D3};
    assertThat(kingBlack.way(kingBlack.position(), Cell.D3), is(expect));
  }
  @Test
  public void whenKingBlackD4C3() {
    Cell[] expect = {Cell.C3};
    assertThat(kingBlack.way(kingBlack.position(), Cell.C3), is(expect));
  }
  @Test
  public void whenKingBlackD4C4() {
    Cell[] expect = {Cell.C4};
    assertThat(kingBlack.way(kingBlack.position(), Cell.C4), is(expect));
  }
  @Test
  public void whenKingBlackD4C5() {
    Cell[] expect = {Cell.C5};
    assertThat(kingBlack.way(kingBlack.position(), Cell.C5), is(expect));
  }
  @Test(expected = ImpossibleMoveException.class)
  public void whenKingBlackD4C6ThenImpossibleMoveException() {
    Cell[] expect = {Cell.C6};
    assertThat(kingBlack.way(kingBlack.position(), Cell.C6), is(expect));
  }
}
