package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Class PassportOfficeTest
 * @author Dmitry Razumov
 * @version 1
 */
public class PassportOfficeTest {
    /**
     * Тест добавляет в коллекцию данные гражданина, если их там нет и вычитывает данные.
     */
    @Test
    public void add() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }

    /**
     * Метод проверяет работу метода добавления гражданина в коллекцию повторно.
     * Если гражданин есть в коллекции, добавление не должно происходить.
     */
    @Test
    public void whenExistAddThenFalse() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.add(citizen), is(false));
    }
}