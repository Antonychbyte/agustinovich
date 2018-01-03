package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *class CalculatorTest - решение задачи "2.3. Элементарный калькулятор. [#185]"
 *@author Густинович Антон (anton14024@yandex.ru)
 */

public class CalculatorTest{

    Calculator calc=new Calculator();
    double result;
    double expect;

    /**
     *Test add
    */
    @Test
    public void whenAddTwoPlusTwoThenFour(){

           calc.add(2,2);
           result=calc.getResult();
           expect=4;

           assertThat(result, is(expect));
    }

    /**
    *Test subtract
    */
    @Test
    public void whenSubtractTwoMinusTwoThenZero(){

           calc.subtract(2,2);
           result=calc.getResult();
           expect=0;

           assertThat(result, is(expect));
    }

     /**
    *Test multiple
    */
    @Test
    public void whenMultipleTwoMultiplyTwoThenFour(){

           calc.multiple(2,2);
           result=calc.getResult();
           expect=4;

           assertThat(result, is(expect));
    }

     /**
    *Test div
    */
    @Test
    public void whenDivTwoDivideTwoThenOne(){

           calc.div(2,2);
           result=calc.getResult();
           expect=1;

           assertThat(result, is(expect));
    }
}