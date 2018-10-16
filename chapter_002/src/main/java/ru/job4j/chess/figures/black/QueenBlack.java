package ru.job4j.chess.figures.black;

import ru.job4j.chess.exceptions.ImpossibleMoveException;
import ru.job4j.chess.figures.*;
import ru.job4j.chess.figures.directions.Diagonal;
import ru.job4j.chess.figures.directions.Horizontal;
import ru.job4j.chess.figures.directions.Vertical;

/**
 * class QueenBlack - контрольное задание "Каркас шахматной доски [#792]"
 * @author  Густинович Антон (anton14024@yandex.ru)
 */
public class QueenBlack implements Figure {

  private final Cell position;

  public QueenBlack(final Cell position) {
    this.position = position;
  }
  @Override
  public Cell position() {
    return this.position;
  }
  @Override
  public Cell[] way(Cell source, Cell dest) {
    int difX = dest.x - source.x;
    int difY = dest.y - source.y;
    boolean diagonal = (difX != 0 || difY != 0) && (Math.abs(difX) == Math.abs(difY));
    boolean horizontal = difX != 0 && difY == 0;
    boolean vertical = difX == 0 && difY != 0;
    if (!diagonal && !horizontal && !vertical) {
      throw new ImpossibleMoveException("Impossible move");
    }
    Cell[] steps = new Cell[0];
    if (diagonal) {
      steps = new Diagonal().cellsArray(source, difX, difY);
    }
    if (horizontal) {
      steps = new Horizontal().cellsArray(source, difX);
    }
    if (vertical) {
      steps = new Vertical().cellsArray(source, difY);
    }
    return steps;
  }
  @Override
  public Figure copy(Cell dest) {
    return new QueenBlack(dest);
  }
}
