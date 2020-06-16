package ru.job4j.condition;

/**
 * Class AlertDivByZero
 * Класс проверяет возможно ли деление на заданное число.
 * @author Dmitry Razumov
 * @version 1
 */
public class AlertDivByZero {
    /**
     * Главный метод программы. Проверяет работоспособность метода possibleDiv.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
    }

    /**
     * Метод проверят можно ли производить деление на заданное число.
     * Для возможности деления, число должно удовлетворять двум условиям:
     * число не должно равняться нулю и число не должно быть отрицательным.
     * @param number Число
     */
    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0.");
        }
        if (number < 0) {
            System.out.println("This is negative numbers");
        }
    }
}
