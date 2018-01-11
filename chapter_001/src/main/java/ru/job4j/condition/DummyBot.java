package ru.job4j.condition;
/**
 *class DummyBot - решение задачи "3.1. Глупый бот. [#31323]"
 *@author Густинович Антон (anton14024@yandex.ru)
 */

public class DummyBot {

    public String botAnswer(String phrase) {


        String answer = "Это ставит меня в тупик. Спросите другой вопрос.";

        if ("Привет, Бот.".equals(phrase)) {
            answer = "Привет, умник.";
        } else if ("Пока.".equals(phrase)) {
            answer = "До скорой встречи.";
        }
        return answer;

    }

}