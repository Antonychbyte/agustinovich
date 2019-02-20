package ru.job4j.sort;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SortUserTest {

  @Test
  public void whenAgeAscending() {
    List<User> list = new ArrayList<>();
    list.add(new User("c", 3));
    list.add(new User("a", 1));
    list.add(new User("b", 2));

    User[] expect = new User[3];
    expect[0] = new User("a", 1);
    expect[1] = new User("b", 2);
    expect[2] = new User("c", 3);

    assertThat(new SortUser().sort(list).toArray(), is(expect));
  }
  @Test
  public void whenSortNameLength() {
    List<User> list = new ArrayList<>();
    list.add(new User("abc", 3));
    list.add(new User("a", 1));
    list.add(new User("ab", 2));

    List<User> expect = new ArrayList<>();
    expect.add(new User("a", 1));
    expect.add(new User("ab", 2));
    expect.add(new User("abc", 3));

    assertThat(new SortUser().sortNameLength(list), is(expect));
  }
  @Test
  public void whenSortByAllFields() {
    List<User> list = new ArrayList<>();
    list.add(new User("a", 4));
    list.add(new User("ab", 2));
    list.add(new User("a", 3));
    list.add(new User("ab", 1));

    List<User> expect = new ArrayList<>();
    expect.add(new User("a", 3));
    expect.add(new User("a", 4));
    expect.add(new User("ab", 1));
    expect.add(new User("ab", 2));

    assertThat(new SortUser().sortByAllFields(list), is(expect));
  }
}
