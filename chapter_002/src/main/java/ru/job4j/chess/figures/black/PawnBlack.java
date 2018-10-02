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
  /**
   * @param source
   * @param dest
   * @return массив клеток, которые может пройти пешка
   * @throws ImpossibleMoveException
   */
  @Override
  public Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException {
    Cell[] steps;
    if (!(source.y == dest.y + 1 && source.x == dest.x)) {
      throw new ImpossibleMoveException("Impossible move");
    } else {
      steps = new Cell[] {dest};
    }
    return steps;
  }
  @Override
  public Figure copy(Cell dest) {
    return new PawnBlack(dest);
  }
}
