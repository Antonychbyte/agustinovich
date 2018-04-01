package ru.job4j.loop;

import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
/**
 * class BildPiramidTest - решение задачи "4.4. Построить пирамиду в псевдографике. [#4412]"
 * @author Густинович Антон (anton14024@yandex.ru
 */
public class BildPiramidTest {
  @Test
  public void whenHeightIsFour() {
    BildPiramid bild = new BildPiramid();
    assertThat(bild.pyramid(6), is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
        .add("     ^     ")
        .add("    ^^^    ")
        .add("   ^^^^^   ")
        .add("  ^^^^^^^  ")
        .add(" ^^^^^^^^^ ")
        .add("^^^^^^^^^^^")
        .toString()));
  }
}