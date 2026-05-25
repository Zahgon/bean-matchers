package com.google.code.beanmatchers;

import static com.google.code.beanmatchers.BeanOperations.properties;
import static java.util.Arrays.asList;
import java.util.List;
import org.hamcrest.Description;

public class HasToStringDescribingPropertiesExcludingMatcher<T> extends AbstractBeanToStringMatcher<T> {

    private final List<String> excludedProperties;

    public HasToStringDescribingPropertiesExcludingMatcher(TypeBasedValueGenerator valueGenerator, String... excludedProperties) {
        super(valueGenerator);
        this.excludedProperties = asList(excludedProperties);
    }

    @Override
    protected boolean matchesSafely(Class beanType, Description mismatchDescription) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void describeTo(Description description) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
