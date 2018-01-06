package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *test for DummyBot.java, решение задачи "3.1. Глупый бот. [#31323]".
 *@author Густинович Антон (anton14024@yandex.ru)
 */

public class DummyBotTest {

    @Test
    public void whenHiBot() {

        DummyBot bot = new DummyBot();

        assertThat(bot.botAnswer("Привет, Бот."), is("Привет, умник."));
    }

    @Test
    public void whenBye() {

        DummyBot bot = new DummyBot();

        assertThat(bot.botAnswer("Пока."), is("До скорой встречи."));
    }

    @Test
    public void whenUnknownPhrase() {

        DummyBot bot = new DummyBot();

        assertThat(bot.botAnswer("Этой фразы ты не знаешь."), is("Это ставит меня в тупик. Спросите другой вопрос."));
    }
}