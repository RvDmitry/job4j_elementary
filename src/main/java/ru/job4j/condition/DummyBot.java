package ru.job4j.condition;

/**
 * Class DummyBot
 * В классе практикуется работа с оператором ветвления if/else.
 * @author Dmitry Razumov
 * @version 1
 */
public class DummyBot {
    /**
     * Метод имитирует работу бота. Ответ бота засивит от заданного вопроса.
     * @param question Вопрос который задается боту
     * @return Строка с ответом бота
     */
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
}
