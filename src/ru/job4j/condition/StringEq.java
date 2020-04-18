package ru.job4j.condition;

/**
 * Class StringEq
 * Класс сравнивает значение строковых переменных.
 * @author Dmitry Razumov
 * @version 1
 */
public class StringEq {
    /**
     * Метод проверяет равны строки или нет.
     * @param login Строка которую нужно сравнить с заданной
     * @return true, если строка равна заданной, false, если не равна
     */
    public static boolean check(String login) {
        String root = new String("root");
        boolean access = root.equals(login);
        return access;
    }

    /**
     * Главный метод программы. Сравнивает значение двух строк и выводит результат сравнения на консоль.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        String your = "your_name";
        boolean access = StringEq.check(your);
        System.out.println(access);
    }
}
