package ru.job4j.chess;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import ru.job4j.chess.exceptions.OccupiedWayException;
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
    assertThat(logic.move(Cell.C1, Cell.A3), is(true));
  }

  @Test(expected = OccupiedWayException.class)
  public void whenPathIsOccupied() {
    assertThat(logic.move(Cell.C1, Cell.E3), is(true));
  }
}

