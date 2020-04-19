package ru.job4j.oop;

/**
 * Class DummyDic
 * В классе практикуется создание объекта и вызов его метода.
 * @author Dmitry Razumov
 * @version 1
 */
public class DummyDic {
    /**
     * Метод принимает и возвращает строку.
     * @param eng Строка
     * @return Строка
     */
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    /**
     * Главный метод программы. Создает объект класса DummyDic и вызывает его метод.
     * Результат работы метода выводит на консоль.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        System.out.println(dic.engToRus("there"));
    }
}
