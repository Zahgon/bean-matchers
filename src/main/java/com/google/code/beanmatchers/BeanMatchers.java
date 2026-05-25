package com.google.code.beanmatchers;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import org.hamcrest.Matcher;

public final class BeanMatchers {

    private static final ValueGeneratorRepository VALUE_GENERATOR_REPOSITORY;

    private static final TypeBasedValueGenerator TYPE_BASED_VALUE_GENERATOR;

    static {
        final Random random = new Random();
        final ValueGeneratorRepository repo = new InMemoryValueGeneratorRepository();
        repo.registerValueGenerator(new StringGenerator(), String.class);
        repo.registerValueGenerator(new UuidGenerator(), UUID.class);
        repo.registerValueGenerator(new IntegerGenerator(random), Integer.class, Integer.TYPE);
        repo.registerValueGenerator(new DoubleGenerator(random), Double.class, Double.TYPE);
        repo.registerValueGenerator(new BooleanGenerator(random), Boolean.class, Boolean.TYPE);
        repo.registerValueGenerator(new LongGenerator(random), Long.class, Long.TYPE);
        repo.registerValueGenerator(new FloatGenerator(random), Float.class, Float.TYPE);
        repo.registerValueGenerator(new ByteGenerator(random), Byte.class, Byte.TYPE);
        repo.registerValueGenerator(new CharacterGenerator(random), Character.class, Character.TYPE);
        repo.registerValueGenerator(new ShortGenerator(random), Short.class, Short.TYPE);
        repo.registerValueGenerator(new ListGenerator(random), List.class);
        repo.registerValueGenerator(new SetGenerator(random), Set.class);
        VALUE_GENERATOR_REPOSITORY = repo;
        final ArrayTypeBasedValueGenerator arrayValueGenerator = new ArrayTypeBasedValueGenerator();
        TYPE_BASED_VALUE_GENERATOR = new DefaultTypeBasedValueGenerator(VALUE_GENERATOR_REPOSITORY, new MockingTypeBasedValueGenerator(), new EnumBasedValueGenerator(random), arrayValueGenerator);
        arrayValueGenerator.setTypeBaseValueGenerator(TYPE_BASED_VALUE_GENERATOR);
    }

    private BeanMatchers() {
    }

    public static Matcher<Class> hasValidGettersAndSettersFor(String... properties) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> Matcher<T> isABeanWithValidGettersAndSettersFor(String... properties) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Matcher<Class> hasValidGettersAndSettersExcluding(String... properties) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> Matcher<T> isABeanWithValidGettersAndSettersExcluding(String... properties) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Matcher<Class> hasValidGettersAndSetters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> Matcher<T> isABeanWithValidGettersAndSetters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Matcher<Class> hasValidBeanConstructor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Matcher<Class> hasValidBeanHashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Matcher<Class> hasValidBeanHashCodeFor(String... properties) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Matcher<Class> hasValidBeanHashCodeExcluding(String... properties) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Matcher<Class> hasValidBeanEquals() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Matcher<Class> hasValidBeanEqualsFor(String... properties) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Matcher<Class> hasValidBeanEqualsExcluding(String... properties) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Matcher<Class> hasValidBeanToString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Matcher<Class> hasValidBeanToStringFor(String... properties) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Matcher<Class> hasValidBeanToStringExcluding(String... properties) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> void registerValueGenerator(ValueGenerator<T> generator, Class<T> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
