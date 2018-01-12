package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

       @Test
       public void whenFiveThenOneHundredAndTwenty() {

              Factorial fact = new Factorial();

              assertThat(fact.calc(5), is(120));
       }

       @Test
       public void whenZeroThenOne() {

              Factorial fact = new Factorial();

              assertThat(fact.calc(0), is(1));
       }
}