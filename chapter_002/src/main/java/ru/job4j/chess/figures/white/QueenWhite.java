package ru.job4j.chess.figures.white;

import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;
import ru.job4j.chess.figures.black.QueenBlack;

/**
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class QueenWhite extends QueenBlack implements Figure {
   // private final Cell position;

    public QueenWhite(final Cell position) {
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
        return new QueenWhite(dest);
    }
}
