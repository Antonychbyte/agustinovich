package ru.job4j.chess.figures.directions;

import ru.job4j.chess.figures.Cell;
/**
 * class Diagonal - контрольное задание "Каркас шахматной доски [#792]"
 * @author  Густинович Антон (anton14024@yandex.ru)
 */
public class Diagonal {
  public Cell[] cellsArray(Cell source, int difX, int difY) {

    Cell[] steps = new Cell[Math.abs(difX)];
    for (int index = 0; index < steps.length; index++) {
      for (Cell cell : Cell.values()) {
        if (cell.x == source.x + difX && cell.y == difY + source.y) {
          steps[index] = cell;
          break;
        }
      }
      difX = difX > 0 ? --difX : ++difX;
      difY = difY > 0 ? --difY : ++difY;
    }
    return steps;
  }
}
