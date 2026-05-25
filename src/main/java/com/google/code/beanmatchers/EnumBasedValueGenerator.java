package com.google.code.beanmatchers;

import java.util.Random;

class EnumBasedValueGenerator implements TypeBasedValueGenerator {

    private final Random random;

    public EnumBasedValueGenerator(Random random) {
        this.random = random;
    }

    public <T> T generate(Class<T> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
