package ru.job4j.loop;

/**
 *class Paint - решение задачи "4.4. Построить пирамиду в псевдографике. [#4412]"
 *@author Густинович Антон (anton14024@yandex.ru)
 */

public class Paint {

    StringBuilder buffer = new StringBuilder();
    String ln = System.lineSeparator();

    public String pyramid(int height) {
        int width = height * 2 - 1;
        for (int row = 1; row <= height; row++) {
            for (int column = 1; column <= width; column++) {
                if ((row + column) > height && column < (row + height)) {
                    buffer.append("^");
                } else {
                    buffer.append(" ");
                }
            }
            buffer.append(ln);
        }

        return buffer.toString();
    }
}