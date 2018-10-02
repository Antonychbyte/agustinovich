package ru.job4j.chess.figures.black;

import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;
import ru.job4j.chess.exceptions.ImpossibleMoveException;
/**
 * class BishopBlack - контрольное задание "Каркас шахматной доски [#792]"
 * @author  Густинович Антон (anton14024@yandex.ru)
 */
public class BishopBlack implements Figure {
  private final Cell position;

  public BishopBlack(final Cell position) {
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
    Cell[] steps = new Cell[Math.abs(difX)];
    if (difX == 0 || difY == 0 || Math.abs(difX) != Math.abs(difY)) {
      throw new ImpossibleMoveException("Impossible move");
    } else {
      for (int index = 0; index < steps.length; index++) {
        for (Cell cell : Cell.values()) {
          if (cell.x == source.x + difX && cell.y == difY + source.y) {
            steps[index] = cell;
          }
        }
        difX = difX > 0 ? --difX : ++difX;
        difY = difY > 0 ? --difY : ++difY;
      }
    }
    return steps;
  }
  @Override
  public Figure copy(Cell dest) {
    return new BishopBlack(dest);
  }
}
