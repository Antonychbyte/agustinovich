package ru.job4j.loop;

/**
 * class Board - решение задачи "4.3. Построить шахматную доску в псевдографике. [#13559]"
 * @author Густинович Антон (anton14024@yandex.ru)
 */


public class Board {

    StringBuilder screen = new StringBuilder();
    String ln = System.lineSeparator();

    public String buildBoard(int h, int l) {

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if ((i + j) % 2 == 0) {
                    screen.append("x");
                } else {
                    screen.append(" ");
                }

            }
            screen.append(ln);
        }
        return screen.toString();
    }
}