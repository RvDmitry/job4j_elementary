package ru.job4j.loop;

/**
 * Class Board
 * Класс рисует шахматную доску в псевдографике
 * @author Dmitry Razumov
 * @version 1
 */
public class Board {
    /**
     * Метод рисует шахматную доску в псевдографике, располагая символы 'X' в шахматном порядке.
     * @param width Ширина доски
     * @param height ВЫсота доски
     */
    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                if ((row + cell) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Главный метод программы. Проверяет работочпособность метода paint.
     * Рисует на консоли шахматную доску.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}
