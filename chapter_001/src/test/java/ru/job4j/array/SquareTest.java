package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * class SquareTest - решение задачи "5.0. Заполнить массив степенями чисел. [#33488]"
 * @author Густинович Антон (anton14024@yandex.ru)
 */

public class SquareTest {

    @Test
    public void whenBoundIsThree() {

        Square square = new Square();

        int[] expect = {1, 4, 9};

        assertThat(square.calculate(3), is(expect));

    }

}