package ru.job4j.comparator;

import java.util.Comparator;

public class ListCompare implements Comparator<String> {

  @Override
  public int compare(String left, String right) {

    int leftSize = left.length();
    int rightSize = right.length();
    int minSize = Math.min(leftSize, rightSize);
    int result = 0;
    int index = 0;
    while (result == 0 && index < minSize) {
      result = Character.compare(left.charAt(index), right.charAt(index));
      index++;
    }
    return result != 0 ? result : leftSize - rightSize;
  }
}
