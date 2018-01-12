package ru.job4j.loop;

/**
 *class Counter - решение задачи "4.1. Подсчет суммы чётных чисел в диапазоне [#192]"
 * @author  Густинович Антон (anton14024@yandex.ru
 */

public class Counter {


    public int add(int start, int finish) {

        int sum = 0;

        if (start > finish) {
            int a = start;
            start = finish;
            finish = a;
        }

        for (int i = start; i <= finish; i++) {

            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
