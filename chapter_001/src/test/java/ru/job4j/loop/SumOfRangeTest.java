package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SumOfRangeTest {
  @Test
  public void whenOneToTenThanThirty() {
    SumOfRange count = new SumOfRange();
    assertThat(count.add(10, 0), is(30));
  }
}