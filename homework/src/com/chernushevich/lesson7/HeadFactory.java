package com.chernushevich.lesson7;

import java.util.Random;

public class HeadFactory {
    private static final Random rand = new Random();

    public Head[] create() {
        Head[] heads = new Head[3];
        for (int i = 1; i < heads.length; i++) {
            heads[i] = Head.values()[];
        }
        return heads;
    }
}
