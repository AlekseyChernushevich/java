package com.chernushevich.lesson7;

public enum Head {
    HEAD_1("Голова типа A"),
    HEAD_2("Голова типа B"),
    HEAD_3("Голова типа C");
    private final String NAME;

    Head(String name) {
        this.NAME = name;
    }

    public String getNAME() {
        return NAME;
    }
}
