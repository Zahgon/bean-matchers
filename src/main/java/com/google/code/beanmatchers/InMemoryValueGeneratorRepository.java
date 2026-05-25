package com.google.code.beanmatchers;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class InMemoryValueGeneratorRepository implements ValueGeneratorRepository {

    private final Map<Class, ValueGenerator> valueGenerators = new ConcurrentHashMap<Class, ValueGenerator>();

    public <T> void registerValueGenerator(ValueGenerator<T> generator, Class<T> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <T> void registerValueGenerator(ValueGenerator<T> generator, Class<T> type, Class<T> extraType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("unchecked")
    public <T> ValueGenerator<T> retrieveValueGenerator(Class<T> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
