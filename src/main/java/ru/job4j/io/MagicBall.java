package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

/**
 * Class MagicBall
 * Класс демонстрирует предсказателя.
 * @author Dmitry Razumov
 * @version 1
 */
public class MagicBall {
    /**
     * Главный метод программы.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 0:
                System.out.println("Да");
                break;
            case 1:
                System.out.println("Нет");
                break;
            default:
                System.out.println("Может быть");
        }
    }
}
