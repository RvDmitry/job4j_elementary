package ru.job4j.condition;

/**
 * Class Greeting
 * В классе практикуется работа со переменными.
 * @author Dmitry Razumov
 * @version 1
 */
public class Greeting {
    /**
     * Главный метод программы. Выполняет преобразование над строкой. Выводит значение строки на консоль.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        idea += " But I am a newbie. ";
        int year = 2020;
        idea += year;
        System.out.println(idea);
    }
}
