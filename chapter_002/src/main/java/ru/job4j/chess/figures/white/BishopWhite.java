package ru.job4j.chess.figures.white;

import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;
import ru.job4j.chess.figures.black.BishopBlack;

/**
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class BishopWhite extends BishopBlack implements Figure  {

    public BishopWhite(final Cell position) {
        super(position);
    }
    @Override
    public Figure copy(Cell dest) {
      return new BishopWhite(dest);
    }
}
