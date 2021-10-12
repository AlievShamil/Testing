package com.company;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {
    private static NamesLibrary lastNameLibrary;
    private static NamesLibrary namesLibrary;

    @BeforeClass
    public static void beforeClass() {
        lastNameLibrary = new NamesLibrary(new String[]{"Pupkin"});
        namesLibrary = new NamesLibrary(new String[]{"Vasya"});
    }

    @Test
    public void shouldReturnName() {
        String randomName = namesLibrary.getRandomValue();

        assertThat(randomName).isNotEmpty();
    }

    @Test
    public void shouldReturnLastName() {
        String randomLastName = namesLibrary.getRandomValue();

        assertThat(randomLastName).isNotEmpty();
    }

    @Test
    public void shouldCreateRandomPerson() {
        NameService nameService = new NameService(namesLibrary, lastNameLibrary);
        String pupkin = "Pupkin";
        String vasya = "Vasya";

        Person person = nameService.generateRandomPerson();

        assertThat(person.getName()).isEqualTo(vasya);
        assertThat(person.getLastName()).isEqualTo(pupkin);
    }
}