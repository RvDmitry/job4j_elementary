package ru.job4j.io;

import java.util.Scanner;

/**
 * Class Matches
 * Класс реализует игру со спичками.
 * @author Dmitry Razumov
 * @version 1
 */
public class Matches {
    /**
     * Метод осуществляет валидацию введенного количества спичек игроками.
     * В метод передается объект Scanner для считывания количества спичек,
     * чтобы в программе не плодить множество объетов данного типа, а создать его единожды.
     * @param input Объект Scanner
     * @param matches Количество оставшихся спичек в игре
     * @return Количество спичек введенное игроком
     */
    public static int inputMatches(Scanner input, int matches) {
        int count;
        while (true) {
            count = input.nextInt();
            if (count < 1 || count > 3) {
                System.out.print("Число должно быть от 1 до 3. Введите число заново: ");
            } else if (count > matches) {
                System.out.print("Вы не можете забрать спичек больше, чем их есть. Спичек всего: " + matches
                        + "\nВведите число заново: ");
            } else {
                break;
            }
        }
        return count;
    }

    /**
     * Главный метод программы. Реализует игру со спичками.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        while (true) {
            System.out.print("Первый игрок введите число: ");
            matches -= inputMatches(input, matches);
            if (matches <= 0) {
                System.out.println("Вы забрали последние спички. Вы выйграли.");
                break;
            }
            System.out.println("Спичек осталось: " + matches);
            System.out.print("Второй игрок введите число: ");
            matches -= inputMatches(input, matches);
            if (matches <= 0) {
                System.out.println("Вы забрали последние спички. Вы выйграли.");
                break;
            }
            System.out.println("Спичек осталось: " + matches);
        }
    }
}
