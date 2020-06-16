package ru.job4j.ex;

/**
 * Class FrequentEx
 * @author Dmitry Razumov
 * @version 1
 */
public class FrequentEx {
    /**
     * Главный метод программы.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        String[] shops = {"Ebay", "Amazon", "Ozon"};
        for (int index = 0; index < shops.length; index++) {
            System.out.println(shops[index]);
        }
    }
}
