package ru.job4j.oop;

/**
 * Class BallStory
 * Класс демонстрирует взаимодействие объектов
 * @author Dmitry Razumov
 * @version 1
 */
public class BallStory {
    /**
     * Главный метод программы. Создает объекты четырех классов и вызывает методы этих классов передавая в них
     * объекты другого класса.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        hare.tryEat(ball);
        wolf.tryEat(ball);
        fox.tryEat(ball);
    }
}
