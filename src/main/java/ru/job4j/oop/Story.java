package ru.job4j.oop;

/**
 * Class Story
 * Класс демонстрирует взаимодействие объектов
 * @author Dmitry Razumov
 * @version 1
 */
public class Story {
    /**
     * Главный метод программы. Создает объекты трех классов и вызывает методы этих классов передавая в них
     * объекты другого класса.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        Pioneer petya = new Pioneer();
        Girl girl = new Girl();
        Wolf wolf = new Wolf();
        girl.help(petya);
        wolf.eat(girl);
        petya.kill(wolf);
    }
}
