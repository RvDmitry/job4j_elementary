package ru.job4j.max;

/**
 * Class Reduce
 * Класс выводит передаваемый ему массив чисел на экран.
 * @author Dmitry Razumov
 * @version 1
 */
public class Reduce {
    /**
     * Массив чисел.
     */
    private int[] array;

    /**
     * Метод присваивает массиву значения.
     * @param array Массив чисел
     */
    public void to(int[] array) {
        this.array = array;
    }

    /**
     * Метод выводит массив на экран
     */
    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    /**
     * Главный метод программы. Объявляет массив чисел. Создает объект класса.
     * И с помощью методов класса передает объекту данный массив и выводит его на экран.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
