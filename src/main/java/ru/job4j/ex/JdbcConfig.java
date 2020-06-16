package ru.job4j.ex;

/**
 * Class JdbcConfig
 * В классе демонстрируется обработка исключения.
 * @author Dmitry Razumov
 * @version 1
 */
public class JdbcConfig {
    /**
     * Метод демонстрирует вызов исключения при неверно заданном параметре.
     * @param url Строка с адресом к базе данных
     * @throws UserInputException Генерируемое исключение
     */
    public static void load(String url) throws UserInputException {
        if (url == null) {
            throw new UserInputException("Url could not be null");
        }
    }

    /**
     * Главный метод программы. В методе демонстрирует обработка исключения при вызове метода load.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        try {
            load("jdbc://localhost:8080");
        } catch (UserInputException e) {
            e.printStackTrace();
        }
    }
}
