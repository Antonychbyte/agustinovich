package ru.job4j.max;

/**
* class Max - решение задачи "3.2. Максимум из двух чисел [#189]"
*@author Густинович Антон (anton14024@yandex.ru)
*/

public class Max {

       public int max(int first, int second) {
         int max = first;
         if (first < second) {
         max = second;
         } else if (first == second) {
           System.out.println("number is equals");
         }
         return max;
       }
}