package com.company;

public class NamesLibrary {
    private final String[] values;

    public NamesLibrary(String[] values) {
        this.values = values;
    }

    public String getRandomValue() {
        return getValue((int) (Math.random() * values.length)-1);
    }

    public String getValue(int index) {
        return values[index];
    }
}
