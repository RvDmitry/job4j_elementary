package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Class SearchAttTest
 * Класс тестирует фильтрацию списка Attachment.
 * @author Dmitry Razumov
 * @version 1
 */
public class SearchAttTest {
    @Test
    public void whenfilterSize() {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13),
                new Attachment("Image 4", 150),
                new Attachment("bug", 120),
                new Attachment("bug", 50)
        );
        List<Attachment> expect = Arrays.asList(
                new Attachment("Image 4", 150),
                new Attachment("bug", 120)
        );
        assertThat(SearchAtt.filterSize(attachments), is(expect));
    }

    @Test
    public void whenfilterName() {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13),
                new Attachment("Image 4", 150),
                new Attachment("bug", 120),
                new Attachment("bug", 50)
        );
        List<Attachment> expect = Arrays.asList(
                new Attachment("bug", 120),
                new Attachment("bug", 50)
        );
        assertThat(SearchAtt.filterName(attachments), is(expect));
    }
}