package ru.job4j.ex;

/**
 * Class FindMaxLength
 * @author Dmitry Razumov
 * @version 1
 */
public class FindMaxLength {
    /**
     * Главный метод программы.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        String[] shops = {"Ebay", null, "Amazon", null, "Ozon"};
        int max = 0;
        for (int index = 0; index < shops.length; index++) {
            String el = shops[index];
            if (el != null && el.length() > max) {
                max = el.length();
            }
        }
        System.out.println("Max length : " + max);
    }
}
