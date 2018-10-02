package ru.job4j.chess;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import ru.job4j.chess.exceptions.ChessExceptions;
import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.black.BishopBlack;
import ru.job4j.chess.figures.black.PawnBlack;

public class LogicTest {

  Logic logic = new Logic();

  @Before
  public void buildTeam() {
    logic.add(new BishopBlack(Cell.C1));
    logic.add(new PawnBlack(Cell.D2));
    logic.add(new PawnBlack(Cell.B3));
  }
  @Test
  public void whenPathIsClear() {
    try {
      assertThat(logic.move(Cell.C1, Cell.A3), is(true));
    } catch (ChessExceptions ce) {
      System.out.println(ce.getMessage());
      Assert.fail();
    }
  }
  @Test
  public void whenPathIsOccupied() {
    try {
      assertThat(logic.move(Cell.C1, Cell.E3), is(false));
    } catch (ChessExceptions ce) {
      System.out.println(ce.getMessage());
    }
  }

}

