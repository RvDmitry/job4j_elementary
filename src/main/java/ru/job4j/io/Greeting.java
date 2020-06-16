package ru.job4j.io;

import java.util.Scanner;

/**
 * Class Greeting
 * В классе практикуется работа со вводом данных в консоли.
 * @author Dmitry Razumov
 * @version 1
 */
public class Greeting {
    /**
     * Главный метод программы. Демонстрирует ввод данных с консоли и вывод на экран.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Добро пожаловать. Как Вас зовут? ");
        String name = input.nextLine();
        System.out.println(name + ", рад Вас видеть!");
    }
}
