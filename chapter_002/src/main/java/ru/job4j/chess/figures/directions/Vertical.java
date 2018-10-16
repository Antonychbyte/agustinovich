package ru.job4j.chess.figures.directions;

import ru.job4j.chess.figures.Cell;
/**
 * class Vertical - контрольное задание "Каркас шахматной доски [#792]"
 * @author  Густинович Антон (anton14024@yandex.ru)
 */
public class Vertical {

  public Cell[] cellsArray(Cell source, int difY) {
    Cell[] steps = new Cell[Math.abs(difY)];
    for (int index = 0; index < steps.length; index++) {
      for (Cell cell : Cell.values()) {
        if (cell.x == source.x && cell.y == source.y + difY) {
          steps[index] = cell;
          break;
        }
      }
      difY = difY > 0 ? --difY : ++difY;
    }
    return steps;
  }
}