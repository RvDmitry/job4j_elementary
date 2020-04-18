package ru.job4j.array;

/**
 * Class ArrayDefinition
 * В классе используется только главный метод Main, в котором практикуется работа с массивами.
 * @author Dmitry Razumov
 * @version 1
 */
public class ArrayDefinition {
    /**
     * Главный метод программы. Объявляются массивы, указывается их размер.
     * Одному массиву присваиваются значения и выводятся на консоль.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Ivan Ivanov";
        names[1] = "Alexandr Alexandrov";
        names[2] = "Fedor Fedorov";
        names[3] = "Petr Petrov";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
