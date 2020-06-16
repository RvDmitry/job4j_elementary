package ru.job4j.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Class SchoolTest
 * Класс тестирует разделение списка учеников на отдельные классы по их балам.
 * @author Dmitry Razumov
 * @version 1
 */
public class SchoolTest {
    private List<Student> students;

    @Before
    public void setUp() {
        students = Arrays.asList(
                new Student(10, "Student 1"),
                new Student(20, "Student 2"),
                new Student(30, "Student 3"),
                new Student(40, "Student 4"),
                new Student(50, "Student 5"),
                new Student(55, "Student 5"),
                new Student(60, "Student 6"),
                new Student(70, "Student 7"),
                new Student(80, "Student 8"),
                new Student(90, "Student 9"),
                new Student(100, "Student 10")
        );
    }

    @Test
    public void whenCollect70and100() {
        List<Student> expected = Arrays.asList(
                new Student(70, "Student 7"),
                new Student(80, "Student 8"),
                new Student(90, "Student 9"),
                new Student(100, "Student 10")
        );
        School school = new School();
        Predicate<Student> predict = student -> student.getScore() >= 70 && student.getScore() <= 100;
        assertThat(school.collect(students, predict), is(expected));
    }

    @Test
    public void whenCollect50and70() {
        List<Student> expected = Arrays.asList(
                new Student(50, "Student 5"),
                new Student(55, "Student 5"),
                new Student(60, "Student 6")
        );
        School school = new School();
        Predicate<Student> predict = student -> student.getScore() >= 50 && student.getScore() < 70;
        assertThat(school.collect(students, predict), is(expected));
    }

    @Test
    public void whenCollect0and50() {
        List<Student> expected = Arrays.asList(
                new Student(10, "Student 1"),
                new Student(20, "Student 2"),
                new Student(30, "Student 3"),
                new Student(40, "Student 4")
        );
        School school = new School();
        Predicate<Student> predict = student -> student.getScore() > 0 && student.getScore() < 50;
        assertThat(school.collect(students, predict), is(expected));
    }

    @Test
    public void whenMapCollect() {
        School school = new School();
        Map<String, Student> rsl = school.collect(students);
        Map<String, Student> expected = new HashMap<>();
        for (var student : students) {
            expected.putIfAbsent(student.getSurname(), student);
        }
        assertThat(rsl, is(expected));
    }
}