package ru.job4j.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
/**
 * 2. Написать программу преобразования List в Map. [#10093]
 */
public class UserConvertTest {

  @Test
  public void whenTest() {

    Map<Integer, User> expected = new HashMap<>();
    expected.put(1, new User(1, "1", "1"));
    expected.put(2, new User(2, "2", "2"));
    expected.put(3, new User(3, "3", "3"));

    List<User> users = new ArrayList<>();
    users.add(new User(1, "1", "1"));
    users.add(new User(2, "2", "2"));
    users.add(new User(3, "3", "3"));

    UserConvert userConvert = new UserConvert();
    Map<Integer, User> result = userConvert.process(users);

    assertThat(result, is(expected));
  }
}
