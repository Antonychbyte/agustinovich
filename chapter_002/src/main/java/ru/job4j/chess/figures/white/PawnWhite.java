package ru.job4j.chess.figures.white;

import ru.job4j.chess.exceptions.ImpossibleMoveException;
import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;
import ru.job4j.chess.figures.black.PawnBlack;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class PawnWhite extends PawnBlack implements Figure {

    public PawnWhite(final Cell position) {
        super(position);
    }
    @Override
    public Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException {
      if (!(dest.y == source.y + 1 && source.x == dest.x)) {
        throw new ImpossibleMoveException("Impossible move");
      }
      return new Cell[] {dest};
    }
    @Override
    public Figure copy(Cell dest) {
        return new PawnWhite(dest);
    }
}
