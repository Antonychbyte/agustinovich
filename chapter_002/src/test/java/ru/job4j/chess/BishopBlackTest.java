package ru.job4j.chess;

import org.junit.Test;
import static org.hamcrest.collection.IsArrayContainingInOrder.arrayContaining;
import static org.junit.Assert.assertThat;
import ru.job4j.chess.exceptions.ImpossibleMoveException;
import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.black.BishopBlack;

public class BishopBlackTest {

  BishopBlack bishopBlack = new BishopBlack(Cell.F8);
  Cell[] expect = {Cell.A7, Cell.B6, Cell.C5};

  @Test
  public void whenPathIsClear() {
    try {
      assertThat(bishopBlack.way(Cell.D4, Cell.A7), arrayContaining(expect));
    } catch (ImpossibleMoveException ime) {
      System.out.println(ime.getMessage());
    }
  }
  @Test
  public void whenPathIsOccupied() {
    try {
      assertThat(bishopBlack.way(Cell.D4, Cell.A6), arrayContaining(expect));
    } catch (ImpossibleMoveException ime) {
      System.out.println(ime.getMessage());
    }
  }
}
