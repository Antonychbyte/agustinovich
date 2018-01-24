package ru.job4j.array;

/**
 * class Square - решение задачи "5.0. Заполнить массив степенями чисел. [#33488]"
 * @author Густинович Антон (anton14024@yandex.ru)
 */

public class Square {

       public int[] calculate(int bound) {

              int[] rst = new int[bound];

              for (int  index = 1; index <= bound; index++) {

                     rst[index - 1] = index * index;
              }
              return rst;
       }
}