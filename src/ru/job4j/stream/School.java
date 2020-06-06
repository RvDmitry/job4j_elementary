package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Class School
 * @author Dmitry Razumov
 * @version 1
 */
public class School {
    /**
     * Метод выполняет разделение общего списка учеников на отдельные классы.
     * Для разделения используется фильтрация по общему баллу.
     * @param students Список учеников
     * @param predict Функциональный интерфейс определяющий разделение учеников
     * @return Отфильтрованный список
     */
    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }

    /**
     * Метод преобразует список студентов в карту студентов.
     * Где ключом является фамилия студента, а значением является сам объект студент.
     * @param students Список студентов
     * @return Карта студентов
     */
    public Map<String, Student> collect(List<Student> students) {
        return students.stream().distinct()
                .collect(Collectors.toMap(Student::getSurname, s -> s));
    }
}
