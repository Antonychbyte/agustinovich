package ru.job4j.sort;

import java.util.*;

public class SortUser {

  public Set<User> sort(List<User> list) {
    return new TreeSet<>(list);
  }

  public List<User> sortNameLength(List<User> list) {
    Collections.sort(list, new CompareNameLength());
    return new ArrayList<User>(list);
  }

  public List<User> sortByAllFields(List<User> list) {
    Collections.sort(list, new CompareAllFields());
    return new ArrayList<>(list);
  }
}
