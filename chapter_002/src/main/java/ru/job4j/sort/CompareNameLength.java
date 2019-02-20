package ru.job4j.sort;

import java.util.Comparator;

public class CompareNameLength implements Comparator<User> {

  @Override
  public int compare(User left, User right) {
    int leftLength = left.getName().length();
    int rightLength = right.getName().length();
    return Integer.compare(leftLength, rightLength);
  }
}
