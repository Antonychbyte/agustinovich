package ru.job4j.search;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class PhoneDictionaryTest {

  @Test
  public void whenOneElementMatches() {

    PhoneDictionary phones = new PhoneDictionary();
    phones.add(new Person("Петр", "Арсентьев", "1234567", "Брянск"));
    phones.add(new Person("Иван", "Иванов", "7654321", "Минск"));
    phones.add(new Person("1", "2", "3", "4"));
    List<Person> result = phones.find("сен");

    List<Person> expect = new ArrayList<>();
    expect.add(new Person("Петр", "Арсентьев", "1234567", "Брянск"));

    assertThat(result, is(expect));
  }
  @Test
  public void whenMultipleElementsMatch() {
    PhoneDictionary phones = new PhoneDictionary();
    phones.add(new Person("Петр", "Арсентьевkey", "1234567", "Брянск"));
    phones.add(new Person("Иван", "Иванов", "7654321", "Минск"));
    phones.add(new Person("1", "2", "123key123", "4"));

    List<Person> expect = new ArrayList<>();
    expect.add(new Person("Петр", "Арсентьевkey", "1234567", "Брянск"));
    expect.add(new Person("1", "2", "123key123", "4"));

    List<Person> result = phones.find("key");

    assertThat(result.containsAll(expect), is(true));
  }
}
