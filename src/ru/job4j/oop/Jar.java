package ru.job4j.oop;

/**
 * Class Jar
 * Класс демонстрирует изменение состояния объектов.
 * @author Dmitry Razumov
 * @version 1
 */
public class Jar {
    /**
     * Количество воды
     */
    private int value;

    /**
     * Конструктор - инициализирует начальное значение value
     * @param size Количество воды
     */
    public Jar(int size) {
        this.value = size;
    }

    /**
     * Метод выполняет процесс переливания воды из одного сосуда в другой.
     * @param another Объект - сосуд
     */
    public void pour(Jar another) {
        this.value = this.value + another.value;
        another.value = 0;
    }

    /**
     * Главный метод программы. Создаются два объекта типа сосуд, с некоторым количеством воды в каждом.
     * Состояние объектов выводится на консоль. Далее из одного сосуда вода переливается в другой.
     * Результат процесса выводится на консоль.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        Jar first = new Jar(10);
        Jar second = new Jar(5);
        System.out.println("first : " + first.value + ". second : " + second.value);
        first.pour(second);
        System.out.println("first : " + first.value + ". second : " + second.value);

    }
}
