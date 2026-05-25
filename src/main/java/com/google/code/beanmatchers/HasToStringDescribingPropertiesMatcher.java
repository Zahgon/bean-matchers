package com.google.code.beanmatchers;

import static java.util.Arrays.asList;
import java.util.List;
import org.hamcrest.Description;

public class HasToStringDescribingPropertiesMatcher<T> extends AbstractBeanToStringMatcher<T> {

    private final List<String> properties;

    public HasToStringDescribingPropertiesMatcher(TypeBasedValueGenerator valueGenerator, String... properties) {
        super(valueGenerator);
        this.properties = asList(properties);
    }

    @Override
    protected boolean matchesSafely(Class beanType, Description mismatchDescription) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void describeTo(Description description) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
