package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
*class CalculateTest - решение задачи "1.4. JUnit [#4122]"
*@author Густинович Антон (anton14024@yandex.ru)
*@since 15.12.17
*@version 1.0
*/

public class CalculateTest {

/**
*Test echo
*/
@Test
     public void whenTakeNameThenThreeEchoPlusName() {

            String input = "Vasya";
            String expect = "Echo, Echo, Echo : Vasya";

            Calculate calc = new Calculate();
            String result =  calc.echo(input);

            assertThat(result, is(expect));
     }
}