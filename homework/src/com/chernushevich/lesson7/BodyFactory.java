package com.chernushevich.lesson7;

public class BodyFactory {
    public Body[] create() {
        Body[] bodies = new Body[3];
        for (int i = 1; i < bodies.length; i++) {
            bodies[i] = Body.values()[];
        }
        return bodies;
    }
}
