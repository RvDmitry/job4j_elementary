package ru.job4j.oop;

/**
 * Class Cat
 * В классе практикуется создание объектов класса и вызов его методов.
 * @author Dmitry Razumov
 * @version 2
 */
public class Cat {
    /**
     * Поле задает еду которую котик съел.
     */
    private String food;

    /**
     * Поле задает кличку котика.
     */
    private String name;

    /**
     * Метод выводит имя котика и что он съел.
     */
    public void show() {
        System.out.printf("Котик %s съел %s \n", this.name, this.food);
    }

    /**
     * Метод задает еду, которую съел котик.
     * @param meat Еда
     */
    public void eat(String meat) {
        this.food = meat;
    }

    /**
     * Метод задает кличку котика.
     * @param nick Кличка
     */
    public void giveNick(String nick) {
        this.name = nick;
    }

    /**
     * Метод возвращает стороку.
     * @return Строка
     */
    public String sound() {
        String voice = "may-may";
        return voice;
    }

    /**
     * Главный метод программы. В методе создаются экземпляры класса Cat и вызывается его методы.
     * Результаты работы методов выводятся на консоль.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.giveNick("Гав");
        gav.eat("kotleta");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.giveNick("Феликс");
        black.eat("fish");
        black.show();
    }
}
