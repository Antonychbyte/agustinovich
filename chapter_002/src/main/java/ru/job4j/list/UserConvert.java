package ru.job4j.list;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2. Написать программу преобразования List в Map. [#10093]
 */
public class UserConvert {

  public Map<Integer, User> process(List<User> users) {
    Map<Integer, User> result = new HashMap<>();
    for (User user : users) {
      result.put(user.getId(), user);
    }
    return result;
  }
}
