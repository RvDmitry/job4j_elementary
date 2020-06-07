package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Class StudentLevel
 * @author Dmitry Razumov
 * @version 1
 */
public class StudentLevel {
    /**
     * Метод возвращает список студентов, у которых балл аттестата больше bound.
     * @param students Список студентов
     * @param bound Заданный балл аттестата
     * @return Отфильтрованный список студентов
     */
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .flatMap(Stream::ofNullable)
                .filter(st -> st.getScore() > bound)
                .sorted(Comparator.comparingInt(Student::getScore))
                .collect(Collectors.toList());
    }
}
