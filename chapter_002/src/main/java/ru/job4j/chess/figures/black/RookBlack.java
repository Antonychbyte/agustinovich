package ru.job4j.chess.figures.black;

import ru.job4j.chess.exceptions.ImpossibleMoveException;
import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;
import ru.job4j.chess.figures.directions.Horizontal;
import ru.job4j.chess.figures.directions.Vertical;
/**
 * class RookBlack - контрольное задание "Каркас шахматной доски [#792]"
 * @author  Густинович Антон (anton14024@yandex.ru)
 */
public class RookBlack implements Figure {

  private final Cell position;

  public RookBlack(final Cell position) {
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
    if ((difX == 0 && difY == 0) || (difX != 0 && difY != 0)) {
      throw new ImpossibleMoveException("Impossible move exception");
    }
    return difY == 0 ? new Horizontal().cellsArray(source, difX) : new Vertical().cellsArray(source, difY);
  }
  @Override
  public Figure copy(Cell dest) {
    return new RookBlack(dest);
  }
}
