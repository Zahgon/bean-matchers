package com.google.code.beanmatchers;

import static java.util.Arrays.asList;
import java.util.List;
import org.hamcrest.Description;

public class HasValidBeanHashCodeExcludingMatcher<T> extends AbstractBeanHashCodeMatcher<T> {

    private final List<String> excludedProperties;

    HasValidBeanHashCodeExcludingMatcher(TypeBasedValueGenerator valueGenerator, String... excludedProperties) {
        super(valueGenerator);
        this.excludedProperties = asList(excludedProperties);
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
