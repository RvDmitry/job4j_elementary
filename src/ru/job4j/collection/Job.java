package ru.job4j.collection;

import java.util.Objects;

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

    /**
     * Метод определяет равна ли одна работа другой.
     * @param o Объект - работа
     * @return true, если две работы идентичны, иначе false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Job job = (Job) o;
        return priority == job.priority && Objects.equals(name, job.name);
    }

    /**
     * Метод вычисляет хеш-код работы.
     * @return Хеш-код
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, priority);
    }
}
