package ru.job4j.stragery;

import java.util.StringJoiner;

/**
 * Class Triangle
 * Класс характеризует треугольник.
 * @author Dmitry Razumov
 * @version 1
 */
public class Triangle implements Shape {
    /**
     * Метод возвращает треугольник в в виде строки.
     * @return Строка
     */
    @Override
    public String draw() {
        StringJoiner pic = new StringJoiner(System.lineSeparator());
        pic.add("   +");
        pic.add("  + +");
        pic.add(" +   +");
        pic.add("+++++++");
        return pic.toString();
    }
}
