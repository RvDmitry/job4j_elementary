package ru.job4j.collection;

/**
 * Class Job
 * Класс характеризует работу.
 * @author Dmitry Razumov
 * @version 1
 */
public class Job implements Comparable<Job> {
    /**
     * Наименование работы.
     */
    private String name;
    /**
     * Приоритет исполнения.
     */
    private int priority;

    /**
     * Конструтор задает параметры работы.
     * @param name Наименование
     * @param priority Приоритет
     */
    public Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    /**
     * Метод возвращает наименование работы.
     * @return Наименование
     */
    public String getName() {
        return name;
    }

    /**
     * Метод возвращает приоритет исполнения.
     * @return  Приоритет
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Метод вовзращает параметры работы в виде строки.
     * @return Строка
     */
    @Override
    public String toString() {
        return "Job{" + "name='" + name + '\'' + ", priority=" + priority + '}';
    }

    /**
     * Метод сравнивает работы.
     * @param another Работа
     * @return Число, характеризующее итог сравнения
     */
    @Override
    public int compareTo(Job another) {
        return Integer.compare(priority, another.priority);
    }
}
