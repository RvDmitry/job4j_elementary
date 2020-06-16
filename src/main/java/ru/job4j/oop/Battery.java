package ru.job4j.oop;

/**
 * Class Battery
 * Класс демонстрирует изменение состояния объектов.
 * @author Dmitry Razumov
 * @version 1
 */
public class Battery {
    /**
     * Уровень заряда батареи
     */
    private int load;

    /**
     * Метод выполняет процесс изменения уровня заряда текущей батареи, путем передачи его другой батареи.
     * @param another Объект - батарея
     */
    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    /**
     * Главный метод программы. Демонстрируется процесс взаимодействия объектов.
     * Создаются два объекта типа батарея. Батареям присваивается некоторое начальное значение.
     * Далее используя метод обмена зарядами батарей, заряд первой батерии передается второй.
     * Начальное состояние батарей и результат взаимодействия выводиться на консоль.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        Battery first = new Battery();
        first.load = 10;
        Battery second = new Battery();
        second.load = 5;
        System.out.println("first : " + first.load + ". second : " + second.load);
        first.exchange(second);
        System.out.println("first : " + first.load + ". second : " + second.load);
    }
}
