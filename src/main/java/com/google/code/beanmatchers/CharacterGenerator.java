package com.google.code.beanmatchers;

import java.nio.ByteBuffer;
import java.util.Random;

class CharacterGenerator implements ValueGenerator<Character> {

    private final Random random;

    public CharacterGenerator(Random random) {
        this.random = random;
    }

    public Character generate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
