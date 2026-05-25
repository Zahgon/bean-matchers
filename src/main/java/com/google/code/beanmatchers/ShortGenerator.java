package com.google.code.beanmatchers;

import java.nio.ByteBuffer;
import java.util.Random;

class ShortGenerator implements ValueGenerator<Short> {

    private final Random random;

    public ShortGenerator(Random random) {
        this.random = random;
    }

    public Short generate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
