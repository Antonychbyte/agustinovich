package ru.job4j.condition;


import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;
/**
 *test for Triangle - решение задачи "3.3. Вычисление площади треугольника [#9461]".
 *@author Густинович Антон (anton14024@yandex.ru)
 */

public class TriangleTest {

    @Test
    public void whenTriangleExist() {

        Point a = new Point(0, 0);
        Point b = new Point(5, 0);
        Point c = new Point(0, 5);
        Triangle triangle = new Triangle(a, b, c);

        assertThat(triangle.area(), closeTo(12.5, 0.1));
    }

    @Test
    public void whenTriangleNotExist() {

        Point a = new Point(0, 0);
        Point b = new Point(5, 0);
        Point c = new Point(10, 0);
        Triangle triangle = new Triangle(a, b, c);

        assertThat(triangle.area(), closeTo(-1, 0.1));

    }


}