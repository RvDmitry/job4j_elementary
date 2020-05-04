package ru.job4j.stragery;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.util.StringJoiner;

/**
 * Class PaintTest
 * В тестовом классе осуществляется подмена системного вывода в консоль, выводом в память.
 * Далее мы получаем массив байт из памяти, преобразуя его в стороку и сравниваем с требуемой нам строкой.
 * Затем восстанавливаем системный вывод снова в консоль.
 * @author Dmitry Razumov
 * @version 1
 */
public class PaintTest {
    @Test
    public void whenDrawSquare() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Square());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("+++++++")
                                .add("+     +")
                                .add("+     +")
                                .add("+++++++")
                                .add("")
                                .toString()
                )
        );
        System.setOut(stdout);
    }
}