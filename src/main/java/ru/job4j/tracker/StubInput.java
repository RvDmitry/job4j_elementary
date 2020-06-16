package ru.job4j.tracker;

/**
 * Class StubInput
 * Класс демонстрирует имплементацию интерфейса и реализует методы заданные в интерфейсе.
 * @author Dmitry Razumov
 * @version 1
 */
public class StubInput implements Input {
    /**
     * Метод, который перееопределяет метод объявленный в интерефейсе.
     * @param question Строка которую ввел пользователь
     * @return Строка
     */
    @Override
    public String askStr(String question) {
        return null;
    }

    /**
     * Метод, который перееопределяет метод объявленный в интерефейсе.
     * @param question Строка которую ввел пользователь
     * @return Число
     */
    @Override
    public int askInt(String question) {
        return 0;
    }
}
