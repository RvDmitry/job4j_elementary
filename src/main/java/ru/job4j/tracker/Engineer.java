package ru.job4j.tracker;

/**
 * Class  Engineer
 * Класс описывает специальность инженер.
 * @author Dmitry Razumov
 * @version 1
 */
public class Engineer extends Profession {
    /**
     * Техническое задание.
     */
    private String task;

    /**
     * Метод возвращает техническое задание.
     * @return Тех. задание
     */
    public String getTask() {
        return task;
    }

    /**
     * Метод задает техническое задание.
     * @param task Тех. задание
     */
    public void setTask(String task) {
        this.task = task;
    }

    /**
     * Метод производит общение с заказчиком.
     */
    public void communicate() { }

    /**
     * Метод сдает отчет о проделанной работе.
     * @return Отчет
     */
    public String submit() {
        return null;
    }
}
