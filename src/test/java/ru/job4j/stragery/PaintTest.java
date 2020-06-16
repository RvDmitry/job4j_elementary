package ru.job4j.stragery;

import org.junit.After;
import org.junit.Before;
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
 * @version 2
 */
public class PaintTest {
    /**
     *  Поле содержит дефолтный вывод в консоль.
     */
    private final PrintStream stdout = System.out;

    /**
     * Буфер для вывода результата.
      */
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    /**
     * Метод устанавливает вывод в буфер.
     */
    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    /**
     * Метод устанавливает вывод в консоль.
     */
    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

    @Test
    public void whenDrawSquare() {
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
    }

    @Test
    public void whenDrawTriangle() {
        new Paint().draw(new Triangle());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("   +")
                                .add("  + +")
                                .add(" +   +")
                                .add("+++++++")
                                .add("")
                                .toString()
                )
        );
    }
}