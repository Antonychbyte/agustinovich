package ru.job4j.sort;

import java.util.*;

public class SortUser {

  public Set<User> sort(List<User> list) {
    return new TreeSet<>(list);
  }

  public List<User> sortNameLength(List<User> list) {
    Collections.sort(list, new Comparator<User>() {
      @Override
      public int compare(User left, User right) {
        int leftLength = left.getName().length();
        int rightLength = right.getName().length();
        return Integer.compare(leftLength, rightLength);
      }
    });
    return new ArrayList<>(list);
  }

  public List<User> sortByAllFields(List<User> list) {
    Collections.sort(list, new Comparator<User>() {
      @Override
      public int compare(User left, User right) {
        int compareByName = left.getName().compareTo(right.getName());
        return compareByName != 0 ? compareByName : Integer.compare(left.getAge(), right.getAge());
      }
    });
    return new ArrayList<>(list);
  }
}
