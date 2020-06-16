package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Class ProfilesTest
 * @author Dmitry Razumov
 * @version 1
 */
public class ProfilesTest {

    @Test
    public void collect() {
        Address ivanov = new Address("Ivanovo", "Street 1", 15, 12);
        Profile first = new Profile(ivanov, "Ivanov I.I.");
        Address petrov = new Address("Tomsk", "Street 2", 30, 5);
        Profile second = new Profile(petrov, "Petrov P.P.");
        Address petrova = new Address("Tomsk", "Street 2", 30, 5);
        Profile third = new Profile(petrova, "Petrova V.V.");
        Address smirnov = new Address("Moskov", "Street 3", 7, 26);
        Profile fourth = new Profile(smirnov, "Smirnov A.A.");
        List<Profile> profiles = Arrays.asList(
                first,
                second,
                third,
                fourth
        );
        List<Address> expected = Arrays.asList(
                ivanov,
                smirnov,
                petrov
        );
        assertThat(Profiles.collect(profiles), is(expected));
    }
}