package ru.job4j.loop;

/**
 * Class Slash
 * Класс рисует символ 'X' в псевдографике.
 * @author Dmitry Razumov
 * @version 1
 */
public class Slash {
    /**
     * Метод на консоле рисует символ 'X' заданного размера.
     * @param size Размер символа
     */
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = row == cell;
                boolean right = row + cell == size - 1;
                if (left || right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Главный метод программы. Используя метод draw на консоле рисует символ 'X'.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}
