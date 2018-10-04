package ru.job4j.chess;

import ru.job4j.chess.exceptions.FigureNotFoundException;
import ru.job4j.chess.exceptions.ImpossibleMoveException;
import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;
import ru.job4j.chess.exceptions.OccupiedWayException;
/**
 * class Logic - контрольное задание "Каркас шахматной доски [#792]"
 * @author  Густинович Антон (anton14024@yandex.ru)
 */
public class Logic {

  private final Figure[] figures = new Figure[32];
  private int index = 0;

  public void add(Figure figure) {
    this.figures[this.index++] = figure;
  }
  /**
   * метод move проверяет не занят ли путь и перезаписывает фигуру в dest, если путь свободен.
   * @param source - текущее положение фигуры
   * @param dest - пункт назначения
   * @return true - если ход возможен
   * @throws FigureNotFoundException
   * @throws OccupiedWayException
   * @throws ImpossibleMoveException
   */
  public boolean move(Cell source, Cell dest)
    throws FigureNotFoundException, OccupiedWayException, ImpossibleMoveException {
    int index = this.findBy(source);
    if (index == -1) {
      throw new FigureNotFoundException("Figure not found");
    }
    Cell[] steps = this.figures[index].way(source, dest);
    for (Cell step : steps) {
      for (int i = 0; i < this.index; i++) {
        if ((step.equals(this.figures[i].position()))) {
          throw new OccupiedWayException("Occupied way");
        }
      }
    }
    this.figures[index] = this.figures[index].copy(dest);
    return true;
  }
  /**
   * @param cell
   * @return result - индекс фигуры в this.figures, если фигура существуес или -1, если фигуры нет
   */
  public int findBy(Cell cell) {
    int result = -1;
    for (int index = 0; index < this.figures.length; index++) {
      if (this.figures[index] != null && this.figures[index].position().equals(cell)) {
        result = index;
      }
    }
    return result;
  }
  /**
   * очищает массив this.figures и сбрасывает указатель на ноль
   */
  public void clean() {
    for (int position = 0; position != this.figures.length; position++) {
      this.figures[position] = null;
    }
    this.index = 0;
  }
}
