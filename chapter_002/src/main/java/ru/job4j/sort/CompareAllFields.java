package ru.job4j.sort;

import java.util.Comparator;

public class CompareAllFields implements Comparator<User> {

  @Override
  public int compare(User left, User right) {
    int compareByName = left.getName().compareTo(right.getName());
    return compareByName != 0 ? compareByName : Integer.compare(left.getAge(), right.getAge());
  }
}
