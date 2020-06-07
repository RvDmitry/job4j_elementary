package ru.job4j.stream;

import java.util.Objects;

/**
 * Class Student
 * Класс описывает ученика.
 * @author Dmitry Razumov
 * @version 1
 */
public class Student {
    /**
     * Общий балл по всем предметам.
     */
    private int score;
    /**
     * Фамилия ученика.
     */
    private String surname;

    /**
     * Конструктор создает ученика.
     * @param score Общий балл
     * @param surname Фамилия
     */
    public Student(int score, String surname) {
        this.score = score;
        this.surname = surname;
    }

    /**
     * Перегруженный конструктор, используется для создания ученика.
     * @param surname Фамилия
     * @param score Общий балл
     */
    public Student(String surname, int score) {
        this(score, surname);
    }

    /**
     * Метод возвращает общий балл.
     * @return Общий балл
     */
    public int getScore() {
        return score;
    }

    /**
     * Метод задает общий балл ученика.
     * @param score Общий балл
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * Метод возвращает фамилию.
     * @return Фамилия
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Метод задает фамилию ученика.
     * @param surname Фамилия
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Метод возвращает описание ученика в виде строки.
     * @return Строка
     */
    @Override
    public String toString() {
        return "Student{" + "score=" + score + ", surname='" + surname + '\'' + '}';
    }

    /**
     * Метод сравнивает двух учеников, проверяя один и тот же это ученик или нет.
     * @param o Ученик
     * @return true, если ученик тот же, иначе false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(surname, student.surname);
    }

    /**
     * Метод вычисляет хеш-код ученика.
     * @return Хеш-код
     */
    @Override
    public int hashCode() {
        return Objects.hash(surname);
    }
}
