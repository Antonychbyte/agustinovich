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

    Set<User> result = new SortUser().sort(list);

    assertThat(result.toArray(), is(expect));
  }
}
