package ru.job4j.calculator;

/**
 * Class Fit
 * Класс вычисляет идеальный вес мужчины и женщины.
 * @author Dmitry Razumov
 * @version 1
 */
public class Fit {
    /**
     * Метод вычисляет идеальный вес мужчины в зависимости от роста.
     * @param height Рост
     * @return Вес
     */
    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    /**
     * Метод вычисляет идеальный вес женщины в зависимости от роста.
     * @param height Рост
     * @return Вес
     */
    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    /**
     * Главный метод программы. Вычисляет идеальный вес мужчины и женщины при определенном заданном росте.
     * Полученные значения выводит на консоль.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        double man = Fit.manWeight(170);
        double woman = Fit.womanWeight(170);
        System.out.println("Man 170 is " + man);
        System.out.println("Woman 170 is " + woman);
    }
}
