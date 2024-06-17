package com.chernushevich.lesson7;

public enum Body {
    BODY_1("Корпус типа А"),
    BODY_2("Корпус типа B"),
    BODY_3("Корпус типа C");
    private final String NAME;

    Body(String name) {
        this.NAME = name;
    }

    public String getNAME() {
        return NAME;
    }
}
