package ru.job4j.stragery;

import java.util.StringJoiner;

/**
 * Class Square
 * Класс характеризует квадрат.
 * @author Dmitry Razumov
 * @version 1
 */
public class Square implements Shape {
    /**
     * Метод возвращяет квадрат в виде строки.
     * @return Строка
     */
    @Override
    public String draw() {
        StringJoiner pic = new StringJoiner(System.lineSeparator());
        pic.add("+++++++");
        pic.add("+     +");
        pic.add("+     +");
        pic.add("+++++++");
        return pic.toString();
    }
}
