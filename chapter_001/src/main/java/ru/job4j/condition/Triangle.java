package ru.job4j.condition;

/**
 *class Triangle - решение задачи "3.3. Вычисление площади треугольника [#9461]"
 *@author Густинович Антон (anton14024@yandex.ru)
 */

public class Triangle {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     *Метод semiPerimeter возвращает полурериметр.
     */
    public double semiPerimeter(double ab, double ac, double bc) {

        return (ab + ac + bc) / 2;
    }

    /**
     *Метод возвращает площадь треугольника, если треугльник существует.
     *@param ab - расстояние между точками a и b
     *@param ac - расстояние между точками a и c
     *@param bc - расстояние между точками b и c
     */
    public double area() {
        double ab = this.a.distance(this.b);
        double ac = this.a.distance(this.c);
        double bc = this.b.distance(this.c);
        double areaTtriangle = -1;
        double sp = semiPerimeter(ab, ac, bc);

        if (exist(ab, ac, bc)) {
            areaTtriangle = Math.sqrt(sp * (sp - ab) * (sp - ac) * (sp - bc));
        }
        return areaTtriangle;
    }
    /**
     *Метод проверяет существует ли треугольник с такими длинами сторон.
     */
    private boolean exist(double ab, double ac, double bc) {

        return  (ab + ac) > bc && (ac + bc) > ab && (ab + bc) > ac; //если это выражение вставить в строку 41,
                                                                    //то метод exist будет не нужен. Что скажет ментор?


    }
}