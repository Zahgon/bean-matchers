package com.google.code.beanmatchers;

import java.lang.reflect.Array;

class ArrayTypeBasedValueGenerator implements TypeBasedValueGenerator {

    private static final int ARRAY_GENERATION_SIZE = 3;

    private TypeBasedValueGenerator typeBaseValueGenerator;

    public <T> T generate(Class<T> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setTypeBaseValueGenerator(TypeBasedValueGenerator typeBaseValueGenerator) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
