package com.google.code.beanmatchers;

import static java.util.Arrays.asList;
import java.util.List;
import org.hamcrest.Description;

public class HasValidBeanEqualsForMatcher<T> extends AbstractBeanEqualsMatcher<T> {

    private final List<String> properties;

    HasValidBeanEqualsForMatcher(TypeBasedValueGenerator valueGenerator, String... properties) {
        super(valueGenerator);
        this.properties = asList(properties);
    }

    @Override
    protected boolean matchesSafely(Class<T> beanType, Description mismatchDescription) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void describeTo(Description description) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
