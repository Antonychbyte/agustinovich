package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *class CalculatorTest - решение задачи "2.3. Элементарный калькулятор. [#185]"
 *@author Густинович Антон (anton14024@yandex.ru)
 */

public class CalculatorTest {

    /**
     *Test add
     */
    @Test
    public void whenAddTwoPlusTwoThenFour() {
        Calculator calc = new Calculator();
        calc.add(2, 2);
        double result = calc.getResult();
        double expect = 4;

        assertThat(result, is(expect));
    }

    /**
     *Test subtract
     */
    @Test
    public void whenSubtractTwoMinusTwoThenZero() {
        Calculator calc = new Calculator();
        calc.subtract(2, 2);
        double result = calc.getResult();
        double expect = 0;

        assertThat(result, is(expect));
    }

    /**
     *Test multiple
     */
    @Test
    public void whenMultipleTwoMultiplyTwoThenFour() {
        Calculator calc = new Calculator();
        calc.multiple(2, 2);
        double result = calc.getResult();
        double expect = 4;

        assertThat(result, is(expect));
    }

    /**
     *Test div
     */
    @Test
    public void whenDivTwoDivideTwoThenOne() {
        Calculator calc = new Calculator();
        calc.div(2, 2);
        double result = calc.getResult();
        double expect = 1;

        assertThat(result, is(expect));
    }
}