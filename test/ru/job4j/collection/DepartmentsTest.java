package ru.job4j.collection;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Class DepartmentsTest
 * Класс тестирует правильность заполнения списка департаментов. А также его сортировку.
 * @author Dmitry Razumov
 * @version 1
 */
public class DepartmentsTest {
    @Test
    public void whenMissed() {
        List<String> input = Arrays.asList("k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        List<String> input = Arrays.asList("k1", "k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenMissedFewDeps() {
        List<String> input = Arrays.asList("k1/sk1/ssk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1", "k1/sk1/ssk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenMissedSecondDeps() {
        List<String> input = Arrays.asList("k1", "k1/sk1/ssk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1", "k1/sk1/ssk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenMissedFirstDeps() {
        List<String> input = Arrays.asList("k1/sk1", "k1/sk1/ssk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1", "k1/sk1/ssk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenCorrectlyDeps() {
        List<String> input = Arrays.asList("k1", "k1/sk1", "k1/sk1/ssk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1", "k1/sk1/ssk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortAsc() {
        List<String> rsl = Arrays.asList(
                "K1/SK1/SSK2",
                "K1/SK2",
                "K1/SK1/SSK1",
                "K1/SK1",
                "K1",
                "K2/SK1/SSK1",
                "K2/SK1",
                "K2/SK2",
                "K2/SK1/SSK2",
                "K2"
        );
        List<String> expected = Arrays.asList(
                "K1",
                "K1/SK1",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K1/SK2",
                "K2",
                "K2/SK1",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2",
                "K2/SK2"
        );
        Departments.sortAsc(rsl);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSortDesc() {
        List<String> rsl = Arrays.asList(
                "K1/SK1/SSK2",
                "K1/SK2",
                "K1/SK1/SSK1",
                "K1/SK1",
                "K1",
                "K2/SK2",
                "K2/SK1/SSK1",
                "K2/SK1",
                "K2/SK1/SSK2",
                "K2"
        );
        List<String> expected = Arrays.asList(
                "K2",
                "K2/SK1",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2",
                "K2/SK2",
                "K1",
                "K1/SK1",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K1/SK2"
        );
        Departments.sortDesc(rsl);
        assertThat(rsl, is(expected));
    }
}