package ru.job4j.chess.figures.white;

import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;
import ru.job4j.chess.figures.black.KnightBlack;

/**
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class KnightWhite extends KnightBlack implements Figure {
    //private final Cell position;

    public KnightWhite(final Cell position) {
        super(position);
    }

//    @Override
//    public Cell position() {
//        return this.position;
//    }
//
//    @Override
//    public Cell[] way(Cell source, Cell dest) {
//        return new Cell[] {dest};
//    }

    @Override
    public Figure copy(Cell dest) {
        return new KnightWhite(dest);
    }
}
