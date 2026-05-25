package com.google.code.beanmatchers;

import java.util.Random;

class ByteGenerator implements ValueGenerator<Byte> {

    private final Random random;

    public ByteGenerator(Random random) {
        this.random = random;
    }

    public Byte generate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
