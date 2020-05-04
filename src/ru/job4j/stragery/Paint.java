package ru.job4j.stragery;

/**
 * Class Paint
 * Класс печатает фигуру в псевдографике.
 * @author Dmitry Razumov
 * @version 1
 */
public class Paint {
    /**
     * Метод рисует фигуру на экране в псевдографике.
     * @param shape Фигура
     */
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    /**
     * Главный метод программы. Создает объекты фигур и с помощью метода draw класс Paint выводит их на кансоль.
     * @param args Параметры командной строки.
     */
    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.draw(new Square());
        System.out.println();
        paint.draw(new Triangle());
    }
}
