package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String in = "Привет, Бот.";
        String expected = "Привет, умник.";
        String out = DummyBot.answer(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenByeBot() {
        String in = "Пока.";
        String rsl = DummyBot.answer(in);
        String expected = "До скорой встречи.";
        Assert.assertEquals(rsl, expected);
    }

    @Test
    public void whenUnknownBot() {
        String in = "Сколько тебе лет?";
        String rsl = DummyBot.answer(in);
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        Assert.assertEquals(rsl, expected);
    }

}