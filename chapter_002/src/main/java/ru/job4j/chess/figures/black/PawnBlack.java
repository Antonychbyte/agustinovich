package ru.job4j.chess.figures.black;

import ru.job4j.chess.exceptions.ImpossibleMoveException;
import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;
/**
 * class PawnBlack - контрольное задание "Каркас шахматной доски [#792]"
 * @author  Густинович Антон (anton14024@yandex.ru)
 */
public class PawnBlack implements Figure {
  private final Cell position;

  public PawnBlack(final Cell position) {
    this.position = position;
  }
  @Override
  public Cell position() {
    return this.position;
  }
  @Override
  public Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException {
    if (!(source.y == dest.y + 1 && source.x == dest.x)) {
      throw new ImpossibleMoveException("Impossible move");
    }
    return new Cell[] {dest};
  }
  @Override
  public Figure copy(Cell dest) {
    return new PawnBlack(dest);
  }
}
