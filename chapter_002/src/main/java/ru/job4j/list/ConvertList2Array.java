package ru.job4j.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConvertList2Array {

  /**
   * 3. Конвертация ArrayList в двухмерный массив [#10035]
   */
  public int[][] toArray(List<Integer> list, int rows) {

    int cells = list.size() % rows > 0 ? list.size() / rows + 1 : list.size() / rows;
    int[][] result = new int[rows][cells];
    Iterator<Integer> iterator = list.iterator();

    for (int[] element : result) {
      for (int index = 0; index < cells; index++) {
        element[index] = iterator.hasNext() ? iterator.next() : 0;
      }
    }
    return result;
  }
  /**
   * 1. Конвертация листа массивов в один лист Integer [#10037]
   * @param list
   * @return
   */
  public List<Integer> convert(List<int[]> list) {

    List<Integer> result = new ArrayList<>();
    Iterator<int[]> iterator = list.iterator();
    while (iterator.hasNext()) {
      for (int element : iterator.next()) {
        result.add(element);
      }
    }
    return result;
  }
}

