package com.google.code.beanmatchers;

import java.util.Random;

class IntegerGenerator implements ValueGenerator<Integer> {

    private final Random random;

    public IntegerGenerator(Random random) {
        this.random = random;
    }

    public Integer generate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
