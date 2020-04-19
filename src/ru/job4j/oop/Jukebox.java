package ru.job4j.oop;

/**
 * Class Jukebox
 * В классе практикуется создание и вывоз метода класса с аргументами.
 * @author Dmitry Razumov
 * @version 1
 */
public class Jukebox {
    /**
     * Метод выводит на консоль разное значение строки в зависимости от принимаемого числа.
     * @param position Число
     */
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    /**
     * Главный метод программы. Создает объект класса и вызовает его метод с разными значениями аргумента.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        jukebox.music(1);
        jukebox.music(2);
        jukebox.music(3);
    }
}
