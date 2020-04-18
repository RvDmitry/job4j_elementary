package ru.job4j.converter;

/**
 * Class Converter.
 * Класс служит для конвертации рублей в евро и доллары.
 * @author Dmitry Razumov
 * @version 1
 */
public class Converter {
    /**
     * Метод конвертирует рубли в евро.
     * @param value Рубли
     * @return Евро
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    /**
     * Метод конвертирует рубли в доллары.
     * @param value Рубли
     * @return Доллары
     */
    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    /**
     * Главный метод программы. Конвертирует рубли в евро и доллары, результат выводит на экран.
     * Тестирует методы на правильность конвертации, результат выводит на экран.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(180);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + dollar + " dollar.");
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result: " + passed);
        in = 180;
        expected = 3;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("180 rubles are 3 dollar. Test result: " + passed);
    }
}
