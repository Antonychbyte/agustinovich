package ru.job4j.array;
/**
 class ArraysMerging - контрольное задание "Слияние отсортированых массивов."
 @author Густинович Антон (anton@yandex.ru)
 */
public class ArraysMerging {

  public int[] arraysMerging(int[] array1, int[] array2) {

    int[] result = new int[array1.length + array2.length];
    int i1 = 0;
    int i2 = 0;
    int ir = 0;
    while ((i1 < array1.length) && (i2 < array2.length)) {
     if (array1[i1] <= array2[i2]) {
        result[ir] = array1[i1];
        i1++;
        ir++;
      } else {
      result[ir] = array2[i2];
        i2++;
        ir++;
     }
    }
    while (i1 < array1.length) {
      result[ir] = array1[i1];
      i1++;
      ir++;
    }
    while (i2 < array2.length) {
      result[ir] = array2[i2];
      i2++;
      ir++;
    }
  return result;
 }
}