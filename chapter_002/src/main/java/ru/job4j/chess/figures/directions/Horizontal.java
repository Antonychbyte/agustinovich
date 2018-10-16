package ru.job4j.chess.figures.directions;

import ru.job4j.chess.figures.Cell;
/**
 * class Horizontal - контрольное задание "Каркас шахматной доски [#792]"
 * @author  Густинович Антон (anton14024@yandex.ru)
 */
public class Horizontal {

  public Cell[] cellsArray(Cell source, int difX) {
    Cell[] steps = new Cell[Math.abs(difX)];
    for (int index = 0; index < steps.length; index++) {
      for (Cell cell : Cell.values()) {
        if (cell.y == source.y && cell.x == source.x + difX) {
          steps[index] = cell;
          break;
        }
      }
      difX = difX > 0 ? --difX : ++difX;
    }
    return steps;
  }
}
