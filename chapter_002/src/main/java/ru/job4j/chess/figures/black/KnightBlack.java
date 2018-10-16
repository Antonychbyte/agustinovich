package ru.job4j.chess.figures.black;

import ru.job4j.chess.exceptions.ImpossibleMoveException;
import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;

/**
 * class KnightBlack - контрольное задание "Каркас шахматной доски [#792]"
 * @author  Густинович Антон (anton14024@yandex.ru)
 */
public class KnightBlack implements Figure {
  private final Cell position;

  public KnightBlack(final Cell position) {
    this.position = position;
  }
  @Override
  public Cell position() {
    return this.position;
  }
  @Override
  public Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException {
    int difX = dest.x - source.x;
    int difY = dest.y - source.y;
    if (!((Math.abs(difX) == 1 && Math.abs(difY) == 2) || (Math.abs(difX) == 2 && Math.abs(difY) == 1))) {
      throw new ImpossibleMoveException("Impossible move exception");
    }
    return new Cell[] {dest};
  }
  @Override
  public Figure copy(Cell dest) {
    return new KnightBlack(dest);
  }
}
