package com.google.code.beanmatchers;

import static org.mockito.Mockito.mock;

class MockingTypeBasedValueGenerator implements TypeBasedValueGenerator {

    public <T> T generate(Class<T> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
