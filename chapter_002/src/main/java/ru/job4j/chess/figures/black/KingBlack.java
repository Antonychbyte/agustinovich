package ru.job4j.chess.figures.black;

import ru.job4j.chess.exceptions.ImpossibleMoveException;
import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;

/**
 * class KingBlack - контрольное задание "Каркас шахматной доски [#792]"
 * @author  Густинович Антон (anton14024@yandex.ru)
 */
public class KingBlack implements Figure {
  private final Cell position;

  public KingBlack(final Cell position) {
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
    if ((difX == 0 && difY == 0) || Math.abs(difX) > 1 || Math.abs(difY) > 1) {
      throw new ImpossibleMoveException("Impossible move");
    }
    return new Cell[] {dest};
  }
  @Override
  public Figure copy(Cell dest) {
    return new KingBlack(dest);
  }
}
