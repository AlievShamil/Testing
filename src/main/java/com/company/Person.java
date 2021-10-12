package com.company;

import org.apache.commons.text.WordUtils;

public class Person {
    private final String name;
    private final String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return nameFormatter(name) + " " + nameFormatter(lastName);
    }

    public String nameFormatter(String value) {
        return WordUtils.capitalizeFully(value);
    }
}
